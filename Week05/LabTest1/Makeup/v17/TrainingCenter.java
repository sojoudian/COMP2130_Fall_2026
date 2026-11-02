import java.util.ArrayList;

public class TrainingCenter {
    public static void main(String[] args) {
        ArrayList<Workshop> workshops = new ArrayList<>();
        workshops.add(new Workshop("Excel", 90.00));
        workshops.add(new Workshop("Writing", 75.00));
        workshops.add(new CertifiedWorkshop("Safety", 120.00, 15));
        workshops.add(new Workshop("Leadership", 140.00));
        workshops.add(new CertifiedWorkshop("Coding", 110.00, 20));

        System.out.println("=== Workshops ===");
        for (Workshop w : workshops) {
            System.out.println(w);
        }
        System.out.println("Workshops offered: " + Workshop.getCount());

        double total = 0;
        int certified = 0;
        Workshop highest = workshops.get(0);
        for (Workshop w : workshops) {
            total += w.getFinalPrice();
            if (w instanceof CertifiedWorkshop) {
                certified++;
            }
            if (w.getFinalPrice() > highest.getFinalPrice()) {
                highest = w;
            }
        }
        System.out.println("Certified workshops: " + certified);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Highest: " + highest);
    }
}
