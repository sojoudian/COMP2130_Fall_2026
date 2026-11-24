import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream output = new DataOutputStream(
                new FileOutputStream("students.dat"))) {
            output.writeUTF("Ann");
            output.writeInt(20);
            output.writeDouble(3.7);
            output.writeUTF("Bob");
            output.writeInt(22);
            output.writeDouble(3.2);
        }
        try (DataInputStream input = new DataInputStream(
                new FileInputStream("students.dat"))) {
            for (int i = 0; i < 2; i++) {
                String name = input.readUTF();
                int age = input.readInt();
                double gpa = input.readDouble();
                System.out.println(name + " " + age + " " + gpa);
            }
        }
        long size = new File("students.dat").length();
        System.out.println("File: " + size + " bytes");
    }
}
