package n1exercici2;


public class CountryAddressFactory implements AddressFactory {

    public Address createAddress(String country) {

        return new CountryAddress(country);

    }

    public PhoneNumber createPhoneNumber(String dialCode) {

        return new CountryPhoneNumber(dialCode);

    }
}