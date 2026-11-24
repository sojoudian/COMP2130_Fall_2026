import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Activity1 {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream output = new FileOutputStream("act1.dat")) {
            output.write(10);
            output.write(300);
        }
        try (FileOutputStream output =
                new FileOutputStream("act1.dat", true)) {
            output.write(20);
        }
        try (FileInputStream input = new FileInputStream("act1.dat")) {
            int value;
            while ((value = input.read()) != -1) {
                System.out.println(value);
            }
        }
        System.out.println("Length: " + new File("act1.dat").length());
    }
}
