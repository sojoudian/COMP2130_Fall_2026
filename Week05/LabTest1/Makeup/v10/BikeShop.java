import java.util.ArrayList;

public class BikeShop {
    public static void main(String[] args) {
        ArrayList<Bike> bikes = new ArrayList<>();
        bikes.add(new Bike("Trail", 450.00));
        bikes.add(new ElectricBike("City", 600.00, 45));
        bikes.add(new Bike("Road", 820.00));
        bikes.add(new ElectricBike("Cargo", 700.00, 20));
        bikes.add(new Bike("Kids", 180.00));

        System.out.println("=== Bikes ===");
        for (Bike b : bikes) {
            System.out.println(b);
        }
        System.out.println("Bikes sold: " + Bike.getCount());

        double total = 0;
        int electric = 0;
        Bike highest = bikes.get(0);
        for (Bike b : bikes) {
            total += b.getFinalPrice();
            if (b instanceof ElectricBike) {
                electric++;
            }
            if (b.getFinalPrice() > highest.getFinalPrice()) {
                highest = b;
            }
        }
        System.out.println("Electric bikes: " + electric);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Highest: " + highest);
    }
}
