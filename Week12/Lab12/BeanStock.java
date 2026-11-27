import java.io.*;
import java.util.*;

public class BeanStock {
    public static void main(String[] args) throws IOException {
        Bean[] beans = {new Bean("Colombia", 12.50, 8),
                new Bean("Ethiopia", 15.00, 5),
                new Bean("Brazil", 10.25, 7),};
        writeBean(beans);
        System.out.println("beans.dat size: " + new File("beans.dat").length() + " bytes");
        readBean();
    }
    public static void writeBean(Bean[] beans) throws IOException{
        try(DataOutputStream out = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream("beans.dat")))){
            for (Bean b: beans){
                out.writeUTF(b.name);
                out.writeDouble(b.price);
                out.writeInt(b.bags);
            }
        }
    }
    public static void readBean() throws IOException{
        double total = 0;
        try(DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("beans.dat")))){
            while(true){
                String name = in.readUTF();
                double price = in.readDouble();
                int bags = in.readInt();
                total += price * bags;
                System.out.println(String.format(
                        Locale.US, "name: %s:, price of each bags: $%.2f, bags %d, $%.2f", name, price, bags, price*bags));
            }
        } catch (EOFException ex){
            System.out.println(String.format(Locale.US, "Total: $%.2f", total));
        }
    }
}

class Bean {
    String name;
    double price;
    int bags;

    Bean(String name, double price, int bags){
        this.name = name;
        this.price = price;
        this.bags = bags;
    }
}

//
//Length   Letter(name) Price Bags  total
//Colombia    2           8           8    4     22
//Ethiopia    2           8           8    4     22
//Brazil      2           6           8    4     20