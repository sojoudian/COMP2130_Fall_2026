import java.util.ArrayList;

public class ShoeStore {
    public static void main(String[] args) {
        ArrayList<Shoe> shoes = new ArrayList<>();
        shoes.add(new DesignerShoe("Prada", 400.00, 25));
        shoes.add(new Shoe("Nike", 150.00));
        shoes.add(new Shoe("Vans", 80.00));
        shoes.add(new DesignerShoe("Gucci", 360.00, 40));
        shoes.add(new Shoe("Puma", 120.00));

        System.out.println("=== Shoes ===");
        for (Shoe s : shoes) {
            System.out.println(s);
        }
        System.out.println("Shoes sold: " + Shoe.getCount());

        double total = 0;
        int designer = 0;
        Shoe highest = shoes.get(0);
        for (Shoe s : shoes) {
            total += s.getFinalPrice();
            if (s instanceof DesignerShoe) {
                designer++;
            }
            if (s.getFinalPrice() > highest.getFinalPrice()) {
                highest = s;
            }
        }
        System.out.println("Designer shoes: " + designer);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Highest: " + highest);
    }
}
