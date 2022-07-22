package n1exercici2;

public class CountryPhoneNumber extends PhoneNumber {

    // Constructor from itself class to receive the parameter dial code
    // from Main.java
    public CountryPhoneNumber(String countryCode){

        this.setDialCode(countryCode);
    }


    public void setPhoneNumber(String phoneNumber) {

        super.setPhoneNumber(phoneNumber);
    }

}