import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientDemo {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException {
        try (ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream("member.dat"))) {
            output.writeObject(new Member("Ann", "secret"));
        }
        Member.count = 5;                   // a new value before the read
        try (ObjectInputStream input = new ObjectInputStream(
                new FileInputStream("member.dat"))) {
            Member copy = (Member) input.readObject();
            System.out.println(copy.name + " " + copy.password);
            System.out.println("Members: " + Member.count);
        }
    }
}

class Member implements Serializable {
    private static final long serialVersionUID = 1L;
    static int count = 0;               // static: not saved
    String name;
    transient String password;          // transient: not saved
    Member(String name, String password) {
        this.name = name;
        this.password = password;
        count++;
        System.out.println("Constructor: " + name);
    }
}