package n1exercici3;

import java.util.ArrayList;
import java.util.List;

public class SuperCommand implements Command{

    private List<Command> list = new ArrayList<Command>();

    public void addCommand(Command command){

        list.add(command);
    }

    @Override
    public void execute(Vehicle vehicle) {

        list.forEach((t)->t.execute(vehicle));

    }
}
