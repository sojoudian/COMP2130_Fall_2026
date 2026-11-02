import java.util.ArrayList;

public class WatchShop {
    public static void main(String[] args) {
        ArrayList<Watch> watches = new ArrayList<>();
        watches.add(new Watch("Casio", 60.00));
        watches.add(new SmartWatch("Garmin", 300.00, 20));
        watches.add(new Watch("Seiko", 340.00));
        watches.add(new Watch("Timex", 45.00));
        watches.add(new SmartWatch("Fitbit", 200.00, 75));

        System.out.println("=== Watches ===");
        for (Watch w : watches) {
            System.out.println(w);
        }
        System.out.println("Watches sold: " + Watch.getCount());

        double total = 0;
        int smart = 0;
        Watch highest = watches.get(0);
        for (Watch w : watches) {
            total += w.getFinalPrice();
            if (w instanceof SmartWatch) {
                smart++;
            }
            if (w.getFinalPrice() > highest.getFinalPrice()) {
                highest = w;
            }
        }
        System.out.println("Smart watches: " + smart);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Highest: " + highest);
    }
}
