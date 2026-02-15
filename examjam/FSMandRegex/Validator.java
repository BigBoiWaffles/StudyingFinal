package ca.utoronto.utm.examjam.FSMandRegex;

import java.io.BufferedReader;
import java.io.FileReader;
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
            Pattern pColons = Pattern.compile("^:{14}$");
            Pattern pStartMarksLine = Pattern.compile("^MARKS For Assignment 1, Part 2$");
            Pattern pGUIMarks = Pattern.compile("^GUI:\\s*(\\d(.\\d)?)/5\\s*$");
            Pattern pCodeMarks = Pattern.compile("^CODE:\\s*(\\d(.\\d)?)/5\\s*$");
            Pattern pEndMarksLine = Pattern.compile("^END MARKS$");
            Pattern pUtorid=Pattern.compile("^(.*)/JugPuzzleGame/src/JugPuzzleGUIController\\.java$");

            inputStream = new BufferedReader(new FileReader(this.fileName));

            int state = 0;

            Matcher m;
            String l, utorid = "";
            float guiMark = 0, codeMark = 0;
            lineNumber = 0;
            while ((l = inputStream.readLine()) != null) {
                lineNumber++;
                switch (state) {
                    case 0:
                        m = pColons.matcher(l);
                        if (m.matches()) {
                            utorid = "";
                            guiMark = 0;
                            codeMark = 0;
                            state = 1;
                        }
                        break;
                    case 1:
                        m = pUtorid.matcher(l);
                        if (m.matches()) {
                            utorid = m.group(1);
                            state = 2;
                        } else {
                            error("Expecting utorid line");
                            return;
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
}
