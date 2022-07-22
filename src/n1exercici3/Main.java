package n1exercici3;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Initialize a list with all vehicles as we want
        List<Vehicle> vehicles =
                List.of(new Vehicle("Coche"),
                        new Vehicle("Barco"),
                        new Vehicle("Avión"),
                        new Vehicle("Bicicleta"));

        SuperCommand sc = new SuperCommand();
        sc.addCommand(new VehicleStart());
        sc.addCommand(new VehicleAccelerate());
        sc.addCommand(new VehicleBrake());

        // Itinerate across the vehicles executing their methods
        System.out.println("\n" +
                "\n" +
                " _  _       ___         _           _     _               \n" +
                "| || |     / _ \\  __ _ | | __ _ __ | | __(_) _ __    __ _ \n" +
                "| || |_   / /_)/ / _` || |/ /| '__|| |/ /| || '_ \\  / _` |\n" +
                "|__   _| / ___/ | (_| ||   < | |   |   < | || | | || (_| |\n" +
                "   |_|   \\/      \\__,_||_|\\_\\|_|   |_|\\_\\|_||_| |_| \\__, |\n" +
                "                                                    |___/ \n");
        for (Vehicle vehicle : vehicles) {

            CommandCommander cc = new CommandCommander();
            cc.execute(sc, vehicle);
            System.out.println("--------------------------------------");
        }

    }

}
