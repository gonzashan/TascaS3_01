package n1exercici2;


public interface AddressFactory {

     // Methods to implements
     PhoneNumber createPhoneNumber(String dialCode);
     Address createAddress(String country);

}