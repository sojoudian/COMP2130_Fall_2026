// File: Week12.java
import java.io.*;

public class Week12 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        byteStreams();
        Sale[] sales = {new Sale("Latte", 5.25, 40), new Sale("Mocha", 5.75, 25), new Sale("Tea", 3.50, 18)};
        dataStreams(sales);
        objectStreams(sales);
        randomAccess();
    }

    public static void byteStreams() throws IOException {
        try (FileOutputStream out = new FileOutputStream("cups.dat")) {
            out.write(45);
            out.write(120);
            out.write(200);
        }
        try (FileInputStream in = new FileInputStream("cups.dat")) {
            System.out.println(in.read() + " " + in.read() + " " + in.read() + " " + in.read());
        }
    }

    public static void dataStreams(Sale[] sales) throws IOException {
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("sales.dat")))) {
            for (Sale s : sales) {
                out.writeUTF(s.item);
                out.writeDouble(s.price);
                out.writeInt(s.cups);
            }
        }
        double total = 0;
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("sales.dat")))) {
            while (true) {
                Sale s = new Sale(in.readUTF(), in.readDouble(), in.readInt());
                System.out.println(s.item + " " + s.price + " " + s.cups);
                total += s.price * s.cups;
            }
        } catch (EOFException ex) {
            System.out.println("Total: $" + total);
        }
    }

    public static void objectStreams(Sale[] sales) throws IOException, ClassNotFoundException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sales.obj"))) {
            out.writeObject(sales);
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("sales.obj"))) {
            Sale[] copy = (Sale[]) in.readObject();
            for (Sale s : copy) {
                System.out.println("Copy: " + s.item + " " + s.price + " " + s.cups);
            }
        }
    }

    public static void randomAccess() throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile("days.dat", "rw")) {
            raf.writeInt(45);
            raf.writeInt(120);
            raf.writeInt(200);
            raf.seek(1 * 4);
            raf.writeInt(150);
            raf.seek(0);
            System.out.println(raf.length() + " bytes: " + raf.readInt() + " " + raf.readInt() + " " + raf.readInt());
        }
    }
}

class Sale implements Serializable {
    private static final long serialVersionUID = 1L;
    String item;
    double price;
    transient int cups;

    Sale(String item, double price, int cups) {
        this.item = item;
        this.price = price;
        this.cups = cups;
    }
}