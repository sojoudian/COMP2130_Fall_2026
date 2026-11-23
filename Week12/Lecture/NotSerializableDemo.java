import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class NotSerializableDemo {
    public static void main(String[] args) throws IOException {
        try (ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream("cup.dat"))) {
            output.writeObject(new Order("Latte", 2));
            System.out.println("Order saved");
            output.writeObject(new Cup());
            System.out.println("Cup saved");
        }
    }
}

class Cup { }                   // no implements Serializable