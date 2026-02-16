// package ca.utoronto.utm.examjam.FSMandRegex;

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
    Validator v = new Validator("phone_data.txt");
    try {
      v.validate();
      for (Map.Entry<String, ArrayList<PhoneNumber>> entry : v.getPhoneNumbers().entrySet()) {

        String groupName = entry.getKey();
        ArrayList<PhoneNumber> numbers = entry.getValue();

        System.out.println("Group: " + groupName);

        for (PhoneNumber p : numbers) {
          System.out.println("  " + p);
        }
      }
    } catch (Exception e) {}
  }

  public Validator(String fileName) {
    this.fileName = fileName;
  }

  public Map<String, ArrayList<PhoneNumber>> getPhoneNumbers(){
    return this.phoneNumbers;
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
      
      Pattern pBEGIN = Pattern.compile("^BEGIN:(\\w+)$");
      Pattern pEND = Pattern.compile("^END$");

      // Group 1: Country Code, Group 2: Area Code, Group 3: Central Office Code, Group 4: Line Number
      Pattern pINTERNATIONAL = Pattern.compile("^(\\d)\\((\\d{3})\\)(\\d{3})-(\\d{4})$");
      
      // Group 1: Central Office Code, Group 2: Line Number
      Pattern pLOCAL = Pattern.compile("^(\\d{3})-(\\d{4})$");

      inputStream = new BufferedReader(new FileReader(this.fileName));

      ArrayList<PhoneNumber> phoneList = null;

      int state = 0;

      Matcher m;
      String line;
      lineNumber = 0;
      while ((line = inputStream.readLine()) != null) {
        lineNumber++;
        switch (state) {
          case 0:
            m = pBEGIN.matcher(line);
            if (m.matches()) {

              phoneList = new ArrayList<PhoneNumber>();
              
              if (!phoneNumbers.containsKey(m.group(1))){
                phoneNumbers.put(m.group(1), phoneList);
              }
              state = 1;
            } else {
              state = 2;
            }
            break;
          case 1:

            if (pEND.matcher(line).matches()){
              state = 0;
              break;
            }

            m = pINTERNATIONAL.matcher(line);
            if (m.matches()){
              PhoneNumber pN = new PhoneNumber();

              pN.setCountryCode(m.group(1));
              pN.setAreaCode(m.group(2));
              pN.setCentralOfficeCode(m.group(3));
              pN.setLineNumber(m.group(4));

              phoneList.add(pN);

              state = 1;
            } else {
              m = pLOCAL.matcher(line);
              if (m.matches()){
                PhoneNumber pN = new PhoneNumber();

                pN.setCountryCode("0");
                pN.setAreaCode("0");
                pN.setCentralOfficeCode(m.group(1));
                pN.setLineNumber(m.group(2));

                phoneList.add(pN);
                state = 1;
              }
            }
          case 2:
            break;
        }
      }
      if (state == 2) {
        error("Not supposed to be here");
      }
    } finally {
      if (inputStream != null) {
        inputStream.close();
      }
    }
  }
}
