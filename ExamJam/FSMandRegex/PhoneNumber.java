package FSMandRegex;

public class PhoneNumber {
    String countryCode, areaCode, centralOfficeCode, lineNumber;
    public PhoneNumber(String countryCode, String areaCode, String centralOfficeCode, String lineNumber) {
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.centralOfficeCode = centralOfficeCode;
        this.lineNumber = lineNumber;
    }
}
