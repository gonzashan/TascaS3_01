package n1exercici2;


public class CountryAddress extends Address {

    // Constructor from itself class to receive the parameter country
    // name from Main.java
    public CountryAddress(String country) {
        this.setCountry(country);
    }

    public String totalAddress() {

        return  getAddress() + "\n" +
                getZipCode() + " "  +
                getTown()    + "\n" +
                getRegion()  + "\n" +
                getCountry() + "\n";
    }
}