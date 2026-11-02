import java.util.ArrayList;

public class PostOffice {
    public static void main(String[] args) {
        ArrayList<Parcel> parcels = new ArrayList<>();
        parcels.add(new ExpressParcel("Ottawa", 24.00, 50));
        parcels.add(new Parcel("Halifax", 31.00));
        parcels.add(new Parcel("Regina", 27.50));
        parcels.add(new ExpressParcel("Calgary", 22.00, 75));
        parcels.add(new Parcel("Quebec", 18.00));

        System.out.println("=== Parcels ===");
        for (Parcel p : parcels) {
            System.out.println(p);
        }
        System.out.println("Parcels sent: " + Parcel.getCount());

        double total = 0;
        int express = 0;
        Parcel highest = parcels.get(0);
        for (Parcel p : parcels) {
            total += p.getFinalPrice();
            if (p instanceof ExpressParcel) {
                express++;
            }
            if (p.getFinalPrice() > highest.getFinalPrice()) {
                highest = p;
            }
        }
        System.out.println("Express parcels: " + express);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Highest: " + highest);
    }
}
