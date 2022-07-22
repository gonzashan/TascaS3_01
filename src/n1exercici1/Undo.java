package n1exercici1;

import java.util.ArrayList;

public class Undo {

    //create an object of SingleObject
    private static Undo INSTANCE;
    private ArrayList<String> history;

    //make the constructor private so that this class cannot be
    //instantiated
    private Undo() {

        this.history = new ArrayList<>();
    }

    //Get the only object available
    public static Undo getInstance() {
        // It'll instance once
        if (INSTANCE == null) {
            INSTANCE = new Undo();
        }
        return INSTANCE;
    }

    // Method to add commands
    public void addCommand(String command) {

        this.history.add(command);
    }

    // Method to delete commands
    public void deleteCommand(String command) {

        this.history.remove(command);
    }

    // Method to showing registers
    public ArrayList<String> getHistory(){

        return this.history;
    }


}
