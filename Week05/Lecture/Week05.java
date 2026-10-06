// File: Week05.java
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Week05 {

    public static void main(String[] args) throws FileNotFoundException {
        tryCatchDemo();
        customDemo();
        fileDemo();
        dialogDemo();
    }

    public static void tryCatchDemo() {
        String[] inputs = {"8", "x", "0"};
        for (String s : inputs) {
            try {
                System.out.println(16 / Integer.parseInt(s));
            } catch (NumberFormatException | ArithmeticException ex) {
                System.out.println("Error: " + ex.getMessage());
            } finally {
                System.out.println("finally");
            }
        }
    }

    public static void customDemo() {
        int[] radii = {5};
        try {
            System.out.println(getRadius(radii, 0));
            System.out.println(getRadius(radii, 3));
        } catch (InvalidRadiusException ex) {
            System.out.println(ex);
            System.out.println("Cause: " + ex.getCause());
        }
    }

    public static int getRadius(int[] radii, int index) throws InvalidRadiusException {
        try {
            return radii[index];
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new InvalidRadiusException("No radius at index " + index, ex);
        }
    }

    public static void fileDemo() throws FileNotFoundException {
        File file = new File("scores.txt");
        try (PrintWriter output = new PrintWriter(file)) {
            output.println("Ann 90");
            output.println("Bob 85");
        }
        System.out.println(file.length() + " bytes");

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                System.out.println(input.next() + " has " + input.nextInt());
            }
        }
    }

    public static void dialogDemo() {
        Frame frame = new Frame();
        FileDialog dialog = new FileDialog(frame, "Open", FileDialog.LOAD);
        dialog.setVisible(true);
        System.out.println("Selected: " + dialog.getFile());
        frame.dispose();
    }
}

class InvalidRadiusException extends Exception {
    public InvalidRadiusException(String message, Throwable cause) {
        super(message, cause);
    }
}