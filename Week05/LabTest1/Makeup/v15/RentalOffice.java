import java.util.ArrayList;

public class RentalOffice {
    public static void main(String[] args) {
        ArrayList<Apartment> apartments = new ArrayList<>();
        apartments.add(new Apartment("King", 1800.00));
        apartments.add(new FurnishedApartment("Queen", 1600.00, 20));
        apartments.add(new Apartment("Bloor", 2100.00));
        apartments.add(new FurnishedApartment("Yonge", 1750.00, 30));
        apartments.add(new Apartment("Dundas", 1500.00));

        System.out.println("=== Apartments ===");
        for (Apartment a : apartments) {
            System.out.println(a);
        }
        System.out.println("Apartments listed: " + Apartment.getCount());

        double total = 0;
        int furnished = 0;
        Apartment highest = apartments.get(0);
        for (Apartment a : apartments) {
            total += a.getFinalPrice();
            if (a instanceof FurnishedApartment) {
                furnished++;
            }
            if (a.getFinalPrice() > highest.getFinalPrice()) {
                highest = a;
            }
        }
        System.out.println("Furnished apartments: " + furnished);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Highest: " + highest);
    }
}
