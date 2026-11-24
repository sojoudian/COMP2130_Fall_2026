import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream test = new FileOutputStream("photo.dat")) {
            test.write(new byte[5000]);
        }
        File source = new File("photo.dat");
        if (!source.exists()) {
            System.out.println("No file: " + source);
            return;
        }
        int count = 0;
        try (BufferedInputStream input = new BufferedInputStream(
                     new FileInputStream(source));
             BufferedOutputStream output = new BufferedOutputStream(
                     new FileOutputStream("photo-copy.dat"))) {
            int value;
            while ((value = input.read()) != -1) {
                output.write(value);
                count++;
            }
        }
        System.out.println("Copied " + count + " bytes");
    }
}
