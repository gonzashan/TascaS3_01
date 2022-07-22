package n1exercici2;


public abstract class Address {

    private String address;
    private String town;
    private String zipCode;
    private String region;
    private String country;

    // Getters
    public String getAddress() {
        return this.address;
    }

    public String getTown() {
        return this.town;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry(){
        return this.country;
    }

    public String totalAddress() {
        return this.address + "\n" + this.town + " " + this.zipCode + "\n" + this.region + "\n" + this.country;
    }

    //Setters
    public void setAddress(String address) {
        this.address = address;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCountry(String country){
        this.country = country;
    }
}