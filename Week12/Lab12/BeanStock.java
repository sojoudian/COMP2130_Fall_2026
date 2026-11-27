import java.io.*;
public class BeanStock {
    public static void main(String[] args) throws IOException {
        Bean[] beans = {new Bean("Colombia", 12.50, 8),
                new Bean("Ethiopia", 15.00, 5),
                new Bean("Brazil", 10.25, 7),};
        writeBean(beans);
        System.out.println("beans.dat size: " + new File("beans.dat").length() + "bytes");
        readBean();
    }
    public static void writeBean(Bean[] beans) throws IOException{
        try(DataOutputStream out = new DataOutputStream(new FileOutputStream("beans.dat"))){
            for (Bean b: beans){
                out.writeUTF(b.name);
                out.writeDouble(b.price);
                out.writeInt(b.bags);
            }
        }
    }
    public static void readBean() throws IOException{
        try(DataInputStream in = new DataInputStream(new FileInputStream("beans.dat"))){
            for(int i=0; i<3; i++){ // 0, 1, 2
                String name = in.readUTF();
                double price = in.readDouble();
                int bags = in.readInt();
                System.out.println(name + " " + price + " " + bags);
            }
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