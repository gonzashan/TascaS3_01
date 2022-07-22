package n1exercici1;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //start the app
        System.out.println("\nSINGLETON PATTERN\n" +
                "** Tecleé opción { Case Sensitive } **" +
                "\nAñadir [add nombre_comando] - Eliminar [delete nombre_comando] " +
                "- Historial [history] - Salir [exit] \n");
        start();
    }

    public static String menuMessage() {
        String op;
        boolean action = false;

        do {

            System.out.print("\u001B[32mtype -> " + "\u001B[0m");
            op = sc.nextLine();

        } while (!checkOption(op));

        return op;
    }

    public static boolean checkOption(String option) {

        return option.contains("add ") || option.contains("delete ")
                || option.equals("history") || option.equals("exit");
    }

    // Starts the app
    public static void start() {

        String op = menuMessage();
        String command;
        String result = op.contains("add ") ? "a" : op.contains("delete ") ? "d" :
                op.contains("history") ? "h" : "e";

        switch (result) {

            case "a":
                if (op.replace("add ", "").equalsIgnoreCase("exit"))
                    System.out.println("error: 'exit' is reserved command. Can't add it!");
                else
                    Undo.getInstance().addCommand(op.replace("add ", ""));
                start();
                break;
            case "d":
                command = op.replace("delete ", "");
                if (Undo.getInstance().getHistory().contains(command)) {
                    Undo.getInstance().deleteCommand(command);
                    System.out.println("Comando " + "\u001B[33m"
                            + command + "\u001B[0m" + " eliminado.");
                } else
                    System.out.println("Este comando no está registrado");
                start();
                break;
            case "h":
                System.out.println("El histórico de comandos es: " + "\u001B[32m"
                        + Undo.getInstance().getHistory() + "\u001B[0m");
                start();
                break;
            default:
                System.out.println("Deu");
        }

    }
}

