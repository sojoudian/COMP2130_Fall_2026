import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class TextVsBinary {
    public static void main(String[] args) throws IOException {
        try (PrintWriter text = new PrintWriter("number.txt")) {
            text.print(199);
        }
        try (DataOutputStream data = new DataOutputStream(
                new FileOutputStream("int.dat"))) {
            data.writeInt(199);
        }
        try (FileOutputStream bytes = new FileOutputStream("byte.dat")) {
            bytes.write(199);
        }
        String[] names = {"number.txt", "int.dat", "byte.dat"};
        System.out.println(new File(names[0]).getAbsolutePath());
        for (String name : names) {
            long size = new File(name).length();
            System.out.println("Size of " + name + ": " + size);
        }
    }
}
