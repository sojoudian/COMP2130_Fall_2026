import java.util.ArrayList;

public class RideBooking {
    public static void main(String[] args) {
        ArrayList<Ride> rides = new ArrayList<>();
        rides.add(new Ride("Airport", 55.00));
        rides.add(new NightRide("Downtown", 30.00, 50));
        rides.add(new Ride("Station", 25.00));
        rides.add(new NightRide("Harbourfront", 40.00, 40));
        rides.add(new Ride("Campus", 18.00));

        System.out.println("=== Rides ===");
        for (Ride r : rides) {
            System.out.println(r);
        }
        System.out.println("Rides booked: " + Ride.getCount());

        double total = 0;
        int night = 0;
        Ride highest = rides.get(0);
        for (Ride r : rides) {
            total += r.getFinalPrice();
            if (r instanceof NightRide) {
                night++;
            }
            if (r.getFinalPrice() > highest.getFinalPrice()) {
                highest = r;
            }
        }
        System.out.println("Night rides: " + night);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Highest: " + highest);
    }
}
