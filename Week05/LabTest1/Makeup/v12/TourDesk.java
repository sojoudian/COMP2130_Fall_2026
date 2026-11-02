import java.util.ArrayList;

public class TourDesk {
    public static void main(String[] args) {
        ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour("Museum", 35.00));
        tours.add(new Tour("Harbour", 48.00));
        tours.add(new GuidedTour("Castle", 40.00, 50));
        tours.add(new Tour("Island", 55.00));
        tours.add(new GuidedTour("Canyon", 52.00, 25));

        System.out.println("=== Tours ===");
        for (Tour t : tours) {
            System.out.println(t);
        }
        System.out.println("Tours booked: " + Tour.getCount());

        double total = 0;
        int guided = 0;
        Tour highest = tours.get(0);
        for (Tour t : tours) {
            total += t.getFinalPrice();
            if (t instanceof GuidedTour) {
                guided++;
            }
            if (t.getFinalPrice() > highest.getFinalPrice()) {
                highest = t;
            }
        }
        System.out.println("Guided tours: " + guided);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Highest: " + highest);
    }
}
