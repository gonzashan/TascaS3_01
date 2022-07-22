package n1exercici2;


public abstract class PhoneNumber {

    private String phoneNumber;
    private String dialCode;

    //Getters
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getDialCode() {
        return this.dialCode;
    }

    //Setters
    public void setDialCode(String dialCode) {
        this.dialCode = dialCode;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }
}
