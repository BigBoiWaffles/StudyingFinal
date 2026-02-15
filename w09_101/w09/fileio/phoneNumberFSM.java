import java.io.IOException;

public class phoneNumberFSM {


    private static boolean isSeparator(char c) {
        return c == ' ' || c == '-' || c == '.';
    }

    public static boolean parsePhoneNumber(String phoneNumber) throws IOException {
        /* Accept any version of a Canadian phone number:
        1234567890
        123-456-7890
        (123) 456-7890
        123.456.7890
        1-123-456-7890
        +1 (123) 456-7890
        +1 123 456 7890
         */

        char [] c =phoneNumber.toCharArray();

        //states of Canadian phone number:
        // q0: Start
        // q1: plus sign
        // q2: optional leading 1 for country code
        // q3: Before area code
        // q4: optional Open bracket
        //q5: 3-digit area code
        //q6: after area code w/bracket
        //q7: after area code w/o brackets
        //q8: optional pre-exchange separator
        //q9: 3-digit exchange code
        //q10: 4-digit line number
        //q11: Fail state
        //q12: Accept state

        enum State {
            START, PLUS, LEADING_ONE_MAYBE, BEFORE_AREA, OPEN_PAREN, AREA_DIGITS,
            AFTER_AREA_CLOSE, AFTER_AREA_NO_PAREN, EXCHANGE_SEP, EXCHANGE_DIGITS, LINE_DIGITS, FAIL, ACCEPT
        }
        State state = State.START;
        int areaDigits = 0; //storage buffer for when we hit area code state
        int exchangeDigits = 0; //storage buffer for when we hit exchange code state
        int lineDigits = 0; //storage buffer for when we line number state
        boolean sawOpenParen = false;

        int i = 0;
        while (i < phoneNumber.length() && state != State.FAIL && state != State.ACCEPT) {
            switch(state) {
                case START:
                    if (c[i] == '+') {
                        state = State.PLUS;
                    } else if (c[i] == '1') {
                        // Could be country code 1 or start of area
                        state = State.LEADING_ONE_MAYBE;
                    } else if (c[i] == '(') {
                        state = State.OPEN_PAREN;
                        sawOpenParen = true;
                    } else if (Character.isDigit(c[i])) {
                        state = State.AREA_DIGITS;
                        areaDigits = 1;
                    } else if (isSeparator(c[i])) {
                        // leading separators allowed (e.g., space)
                        state = State.BEFORE_AREA;
                    } else {
                        state = State.FAIL;
                    }
                    i++;
                    break;

                case PLUS:
                    // expect country code '1' after +
                    if (c[i] == '1') {
                        state = State.LEADING_ONE_MAYBE;
                        i++;
                    } else {
                        state = State.FAIL;
                    }
                    break;

                case LEADING_ONE_MAYBE:
                    // after optional leading '1' we may see sep, space, paren, or digits for area
                    if (c[i] == '(') {
                        state = State.OPEN_PAREN;
                        sawOpenParen = true;
                        i++;
                    } else if (Character.isDigit(c[i])) {
                        // this digit is actually the first area digit (if leading '1' was country code)
                        state = State.AREA_DIGITS;
                        areaDigits = 2;
                        i++;
                    } else if (isSeparator(c[i])) {
                        // separator between country code and area
                        state = State.BEFORE_AREA;
                        i++;
                    } else {
                        state = State.FAIL;
                    }
                    break;

                case BEFORE_AREA:
                    // skip separators until digit or '('
                    if (c[i] == '(') {
                        state = State.OPEN_PAREN;
                        sawOpenParen = true;
                    } else if (Character.isDigit(c[i])) {
                        state = State.AREA_DIGITS;
                        areaDigits = 1;
                    } else if (isSeparator(c[i])) {
                        // keep skipping
                    } else {
                        state = State.FAIL;
                    }
                    i++;
                    break;

                case OPEN_PAREN:
                    // next should be digit starting area
                    if (Character.isDigit(c[i])) {
                        state = State.AREA_DIGITS;
                        areaDigits = 1;
                        i++;
                    } else {
                        state = State.FAIL;
                    }
                    break;

                case AREA_DIGITS:
                    if (areaDigits < 3 && Character.isDigit(c[i])) {
                        areaDigits++;
                        i++;
                    } else if (sawOpenParen && c[i] == ')') {
                        // close paren after exactly 3 digits
                        if (areaDigits == 3) {
                            state = State.AFTER_AREA_CLOSE;
                            i++;
                        } else {
                            state = State.FAIL;
                        }
                    } else if (!sawOpenParen && isSeparator(c[i])) {
                        // area finished without paren if we already have 3 digits
                        if (areaDigits == 3) {
                            state = State.EXCHANGE_DIGITS;
                            i++;
                        } else {
                            state = State.FAIL;
                        }
                    } else if (Character.isDigit(c[i])) {
                        state = State.EXCHANGE_DIGITS;
                        exchangeDigits++;
                        i++;
                    } else {
                        state = State.FAIL;
                    }
                    break;

                case AFTER_AREA_CLOSE:
                    // expect separator (maybe) then prefix (3 digits)
                    if (isSeparator(c[i])) {
                        state = State.EXCHANGE_SEP;
                        i++;
                    } else if (Character.isDigit(c[i])) {
                        state = State.EXCHANGE_DIGITS;
                        exchangeDigits++;
                        i++;
                    } else {
                        state = State.FAIL;
                    }
                    break;

                case EXCHANGE_SEP:
                    // skip additional separators until digit
                    if (Character.isDigit(c[i])) {
                        state = State.EXCHANGE_DIGITS;
                        exchangeDigits = 1;
                        i++;
                    } else if (isSeparator(c[i])) {
                        i++;
                    } else {
                        state = State.FAIL;
                    }
                    break;

                case EXCHANGE_DIGITS:
                    if (exchangeDigits < 3 && Character.isDigit(c[i])) {
                        exchangeDigits++;
                        i++;
                    } else if (isSeparator(c[i])) {
                        if (exchangeDigits == 3) {
                            state = State.LINE_DIGITS;
                            i++;
                        } else {
                            state = State.FAIL;
                        }
                    }else if (Character.isDigit(c[i])){
                        state = State.LINE_DIGITS;
                        lineDigits = 1;
                        i++;
                    }
                    else {
                        state = State.FAIL;
                    }
                    break;

                case LINE_DIGITS:
                    if (Character.isDigit(c[i])) {
                        lineDigits++;
                        i++;
                        if (lineDigits > 4) state = State.FAIL;
                    } else {
                        state = State.FAIL;
                    }
                    break;

                default:
                    state = State.FAIL;
                    break;
            }
        }
        if (state == State.LINE_DIGITS) {
            state = State.ACCEPT;
        }

        return state == State.ACCEPT;
    }


    public static void main(String[] args) throws IOException {
        String[] tests = {
                "1234567890",
                "123-456-7890",
                "(123) 456-7890",
                "123.456.7890",
                "1-123-456-7890",
                "+1 (123) 456-7890",
                "+1 123 456 7890",
                "(123)456-7890",
                "21234567890",    // invalid: starts with 2 and length 11
                "123-45-6789",    // invalid
                "abc-123-4567",   // invalid
                "123) 456-7890",  // invalid
        };

        for (String t : tests) {
            System.out.println(t + ": " + parsePhoneNumber(t));
        }
    }

}
