import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DetectEndOfFile {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream output = new DataOutputStream(
                new FileOutputStream("hours.dat"))) {
            output.writeDouble(7.5);
            output.writeDouble(8.0);
            output.writeDouble(6.5);
        }
        int count = 0;
        double total = 0;
        try (DataInputStream input = new DataInputStream(
                new FileInputStream("hours.dat"))) {
            while (true) {
                total += input.readDouble();
                count++;
            }
        } catch (EOFException e) {
            System.out.println("End of file after " + count + " values");
        }
        System.out.println("Total: " + total);
    }
}
