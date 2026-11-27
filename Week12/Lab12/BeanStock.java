import java.io.*;
public class BeanStock {
    public static void main(String[] args) throws IOException {
        Bean[] beans = {new Bean("Colombia", 12.50, 8),
                new Bean("Ethiopia", 15.00, 5),
                new Bean("Brazil", 10.25, 7),};
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