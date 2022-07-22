package n1exercici3;

public class VehicleBrake implements Command{

    @Override
    public void execute(Vehicle vehicle) {

        System.out.println("Vehículo " + vehicle.getType() + " frena." );
    }
}
