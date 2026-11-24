import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectArrayDemo {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException {
        Order[] orders = {new Order("Latte", 2), new Order("Mocha", 1),
                          new Order("Tea", 3)};
        try (ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream("orders.dat"))) {
            output.writeObject(orders);
        }
        try (ObjectInputStream input = new ObjectInputStream(
                new FileInputStream("orders.dat"))) {
            Order[] copy = (Order[]) input.readObject();
            System.out.println(copy.length + " orders");
            System.out.println(Arrays.toString(copy));
            System.out.println(copy == orders);
        }
    }
}
