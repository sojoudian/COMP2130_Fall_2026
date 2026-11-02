import java.util.ArrayList;

public class LaptopShop {
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Dell", 900.00));
        laptops.add(new Laptop("Acer", 650.00));
        laptops.add(new GamingLaptop("Asus", 1200.00, 35));
        laptops.add(new GamingLaptop("MSI", 1400.00, 10));
        laptops.add(new Laptop("HP", 780.00));

        System.out.println("=== Laptops ===");
        for (Laptop l : laptops) {
            System.out.println(l);
        }
        System.out.println("Laptops sold: " + Laptop.getCount());

        double total = 0;
        int gaming = 0;
        Laptop highest = laptops.get(0);
        for (Laptop l : laptops) {
            total += l.getFinalPrice();
            if (l instanceof GamingLaptop) {
                gaming++;
            }
            if (l.getFinalPrice() > highest.getFinalPrice()) {
                highest = l;
            }
        }
        System.out.println("Gaming laptops: " + gaming);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Highest: " + highest);
    }
}
