package FSMandRegex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * EXERCISE: Create a java program that reads a file as specified
 * on the command line. The file consists of a collection of blocks,
 * each block has a header and then a list of phone numbers.
 * Populate a Map, keyed off the the blocks name. Each phone number
 * should populate a PhoneNumber object
 * which has countryCode, areaCode, centralOfficeCode, lineNumber
 * Use 0 for the default countryCode, areaCode if they are not supplied.
 * EXAMPLE:
 *
 * BEGIN:bestFriends
 * 1(234)555-1111
 * 745-2345
 * 555-1212
 * 1(212)718-9991
 * END
 * BEGIN:friends
 * 1(234)555-2222
 * 745-2346
 * 555-1214
 * 1(212)728-9991
 * END
 */

// FIX THE CODE BELOW!!

public class Validator {
    public static void main(String[] args) {
        Validator v = new Validator(args[1]);
    }

    public Validator(String fileName) {
        this.fileName = fileName;
    }

    private void error(String mesg){
        this.errorMessage=lineNumber+":"+mesg;
        this.isParse=false;
    }

    private int lineNumber = 0;
    private String errorMessage = "";
    private String fileName = "";
    private boolean isParse = false;
    private Map<String, ArrayList<PhoneNumber>> phoneNumbers = new HashMap<>();

    public void validate() throws Exception {
        BufferedReader inputStream = null;
        try {
            Pattern pBegin = Pattern.compile("^BEGIN:(.+)+$");
            Pattern pEnd = Pattern.compile("^END$");
            Pattern pPhoneNumber = Pattern.compile("^(\\d)\\((\\d+)\\)(\\d+)-(\\d+)$");
            Pattern pLocalNumber = Pattern.compile("^(\\d+)-(\\d+)$");

            inputStream = new BufferedReader(new FileReader(this.fileName));

            int state = 0;
            String currentBlockName = "";
            ArrayList<PhoneNumber> currentPhoneList = null;

            Matcher m;
            String l;
            lineNumber = 0;
            while ((l = inputStream.readLine()) != null) {
                lineNumber++;
                if(l.isEmpty()){
                    continue;
                }
                switch (state) {
                    case 0:
                        m = pBegin.matcher(l);
                        if (m.matches()){
                            currentBlockName = m.group(1);
                            currentPhoneList = new ArrayList<>();
                            state = 1;
                        } else {
                            error("Expecting BEGIN:blockName, got: "+ l);
                            return;
                        }
                        break;
                    case 1:
                        m = pEnd.matcher(l);
                        if(m.matches()){
                            phoneNumbers.put(currentBlockName, currentPhoneList);
                            state = 0;
                        } else {
                            PhoneNumber pn = parsePhoneNumber(l);
                            if (pn != null){
                                currentPhoneList.add(pn);
                            } else {
                                error("Invalid phone number format: " + l);
                                return;
                            }
                            break;
                        }
                }
            }
            if (state != 0) {
                error("Expected end of file");
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    private PhoneNumber parsePhoneNumber(String line) {
        // Try full format: 1(234)555-1111
        Pattern pFullPhone = Pattern.compile("^(\\d+)\\((\\d+)\\)(\\d+)-(\\d+)$");
        Matcher m = pFullPhone.matcher(line);
        if (m.matches()) {
            String countryCode = m.group(1);
            String areaCode = m.group(2);
            String centralOfficeCode = m.group(3);
            String lineNumber = m.group(4);
            return new PhoneNumber(countryCode, areaCode, centralOfficeCode, lineNumber);
        }

        // Try 7-digit local format: 555-1212
        Pattern pLocalPhone = Pattern.compile("^(\\d+)-(\\d+)$");
        m = pLocalPhone.matcher(line);
        if (m.matches()) {
            String centralOfficeCode = m.group(1);
            String lineNumber = m.group(2);
            return new PhoneNumber("0", "0", centralOfficeCode, lineNumber);
        }

        return null; // Invalid format
    }
}
