import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Activity3 {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException {
        Drink tea = new Drink("Tea", 12);
        try (ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream("act3.dat"))) {
            output.writeObject(tea);
        }
        tea.size = 16;
        try (ObjectInputStream input = new ObjectInputStream(
                new FileInputStream("act3.dat"))) {
            Drink copy = (Drink) input.readObject();
            System.out.println(copy.name + " " + copy.size + " " + copy.sugar);
        }
    }
}

class Drink implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int size;
    transient int sugar = 2;

    Drink(String name, int size) {
        this.name = name;
        this.size = size;
        System.out.println("New drink: " + name);
    }
}
