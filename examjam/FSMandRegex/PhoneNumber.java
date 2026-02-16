// package ca.utoronto.utm.examjam.FSMandRegex;


public class PhoneNumber {
  private String countryCode;
  private String areaCode;
  private String centralOfficeCode;
  private String lineNumber;

  public PhoneNumber(){}

  public void setCountryCode(String s){ this.countryCode = s; }
  public void setAreaCode(String s){ this.areaCode = s; }
  public void setCentralOfficeCode(String s){ this.centralOfficeCode = s; }
  public void setLineNumber(String s){ this.lineNumber = s; }

  @Override
  public String toString() {
    return countryCode + "(" + areaCode + ")" + centralOfficeCode + "-" + lineNumber;
  }
}
/*
public class PhoneNumber {
    String countryCode, areaCode, centralOfficeCode, lineNumber;
    public PhoneNumber(String countryCode, String areaCode, String centralOfficeCode, String lineNumber) {
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.centralOfficeCode = centralOfficeCode;
        this.lineNumber = lineNumber;
    }
}
*/
