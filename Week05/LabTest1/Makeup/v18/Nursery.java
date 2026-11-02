import java.util.ArrayList;

public class Nursery {
    public static void main(String[] args) {
        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(new RarePlant("Orchid", 45.00, 60));
        plants.add(new Plant("Fern", 18.00));
        plants.add(new Plant("Cactus", 12.50));
        plants.add(new Plant("Bonsai", 70.00));
        plants.add(new RarePlant("Lotus", 50.00, 30));

        System.out.println("=== Plants ===");
        for (Plant p : plants) {
            System.out.println(p);
        }
        System.out.println("Plants sold: " + Plant.getCount());

        double total = 0;
        int rare = 0;
        Plant highest = plants.get(0);
        for (Plant p : plants) {
            total += p.getFinalPrice();
            if (p instanceof RarePlant) {
                rare++;
            }
            if (p.getFinalPrice() > highest.getFinalPrice()) {
                highest = p;
            }
        }
        System.out.println("Rare plants: " + rare);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Highest: " + highest);
    }
}
