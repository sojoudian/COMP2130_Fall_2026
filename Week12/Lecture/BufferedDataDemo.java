import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDataDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("numbers.dat");
        DataOutputStream output = new DataOutputStream(
                new BufferedOutputStream(new FileOutputStream(file)));
        for (int i = 1; i <= 1000; i++) {
            output.writeInt(i);
        }
        System.out.println("Before close: " + file.length() + " bytes");
        output.close();
        System.out.println("After close: " + file.length() + " bytes");
        int sum = 0;
        try (DataInputStream input = new DataInputStream(
                new BufferedInputStream(new FileInputStream(file)))) {
            for (int i = 1; i <= 1000; i++) {
                sum += input.readInt();
            }
        }
        System.out.println("Sum: " + sum);
    }
}
