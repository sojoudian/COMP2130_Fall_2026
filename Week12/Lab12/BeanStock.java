import java.io.*;
import java.util.*;
public class BeanStock {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Bean[] beans = {new Bean("Colombia", 12.50, 8),
                new Bean("Ethiopia", 15.00, 5),
                new Bean("Brazil", 10.25, 7)};
        writeBeans(beans);
        System.out.println();
        readBeans();
        saveBeans(beans);
    }
    public static void writeBeans(Bean[] beans) throws IOException {
        try (DataOutputStream out = new DataOutputStream( new BufferedOutputStream(
                new FileOutputStream("beans.dat")))){
            for (Bean b : beans){
                out.writeUTF(b.name);
                out.writeDouble(b.price);
                out.writeInt(b.bags);
            }
        }
    }
    public static void readBeans() throws IOException {
        double total = 0;
       try (DataInputStream in = new DataInputStream( new BufferedInputStream(
               new FileInputStream("beans.dat")))){
           while(true){
               String name = in.readUTF();
               double price = in.readDouble();
               int bags = in.readInt();
               total += price * bags;
               System.out.println(String.format(Locale.US, "%s: %d bags, $%.2f", name, bags, price*bags));
           }
       } catch (EOFException ex){
           System.out.println(String.format(Locale.US, "Total: $%.2f", total));
       }
    }
    public static void saveBeans(Bean[] beans) throws IOException, ClassNotFoundException {
        beans[1].note= "low stock";
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("beans.obj"))){
            out.writeObject(beans);
        }
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("beans.obj"))){
            Bean[] copy = (Bean[]) in.readObject();
            System.out.println("Before: " + beans[1].name + ", " + beans[1].note);
            System.out.println("after: " + copy[1].name + ", " + copy[1].note);
        }
    }
}

class Bean implements Serializable {
    private static final long serialVersionID = 1L;
    String name;
    double price;
    int bags;
    transient String note;

    Bean(String name, double price, int bags){
        this.name = name;
        this.price = price;
        this.bags = bags;
    }
}