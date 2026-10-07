import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class DrinkMenu {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(new File("menu.txt"));
             PrintWriter output = new PrintWriter(new File("clean_menu.txt"))) {
            double total = 0;
            while (input.hasNext()) {
                String name = input.next();
                String text = input.next();
                try {
                    double price = Double.parseDouble(text);
                    if (price < 0) {
                        throw new IllegalArgumentException("negative price");
                    }
                    System.out.println(name + " $" + String.format(Locale.US, "%.2f", price));
                    output.println(name + " " + text);
                    total += price;
                } catch (NumberFormatException ex) {
                    System.out.println("Bad price for " + name + ": " + text);
                } catch (IllegalArgumentException ex) {
                    System.out.println("Bad price for " + name + ": " + ex.getMessage());
                }
            }
            System.out.println("Total: $" + String.format(Locale.US, "%.2f", total));
            output.println("Total " + String.format(Locale.US, "%.2f", total));
        } catch (FileNotFoundException ex) {
            System.out.println("Cannot open menu.txt");
        }
    }
}
