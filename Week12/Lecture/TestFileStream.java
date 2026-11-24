import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream output = new FileOutputStream("scores.dat")) {
            output.write(90);
            output.write(85);
        }
        try (FileOutputStream output =
                new FileOutputStream("scores.dat", true)) {
            output.write(200);
        }
        try (FileInputStream input = new FileInputStream("scores.dat")) {
            int value;
            while ((value = input.read()) != -1) {
                System.out.print(value + " ");
            }
        }
        System.out.println();
    }
}
