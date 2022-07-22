package n1exercici2;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nAGENDA 2030 - BarcelonaActiva\n======================================");

        //
        AddressFactory countryAddressFactory = new CountryAddressFactory();

        String[][] address = {
                {"Calle Mestre Serrano", "Ciutadella de Menorca", "07760", "Islas Baleares", "971 38 10 50", "España", "+34"},
                {"Theresienhöhe 28", "Munich", "80339", "Babiera", "89 5502 9595", "Alemania", "+49"}};

        for (String[] registers : address) {

            Address countryAddress = countryAddressFactory.createAddress(registers[5]);
            PhoneNumber countryPhone = countryAddressFactory.createPhoneNumber(registers[6]);

            //Setting data
            countryAddress.setAddress(registers[0]);
            countryAddress.setTown(registers[1]);
            countryAddress.setZipCode(registers[2]);
            countryAddress.setRegion(registers[3]);
            countryPhone.setPhoneNumber(registers[4]);

            System.out.println(registers[5].toUpperCase() + " de direcciones:");
            System.out.println(countryAddress.totalAddress());
            System.out.println("Número teléfono: (" + countryPhone.getDialCode()
                    + ") " + countryPhone.getPhoneNumber());
            System.out.println("___________________________________________\n");
        }
    }
}
