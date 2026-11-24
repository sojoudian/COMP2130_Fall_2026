import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Activity2Fix {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream output = new DataOutputStream(
                new BufferedOutputStream(new FileOutputStream("act2.dat")))) {
            output.writeUTF("Eve");
            output.writeInt(85);
        }
        try (DataInputStream input = new DataInputStream(
                new BufferedInputStream(new FileInputStream("act2.dat")))) {
            String name = input.readUTF();
            int score = input.readInt();
            System.out.println(name + " " + score);
        }
    }
}
