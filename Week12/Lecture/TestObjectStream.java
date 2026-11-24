import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class TestObjectStream {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException {
        int[] scores = {90, 85, 77};
        try (ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream("object.dat"))) {
            output.writeObject("Ann");
            output.writeObject(scores);
            output.writeDouble(3.7);
        }
        try (ObjectInputStream input = new ObjectInputStream(
                new FileInputStream("object.dat"))) {
            String name = (String) input.readObject();
            int[] copy = (int[]) input.readObject();
            double gpa = input.readDouble();
            System.out.println(name + " " + Arrays.toString(copy) + " " + gpa);
        }
    }
}
