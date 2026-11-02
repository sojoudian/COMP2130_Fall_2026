import java.util.ArrayList;

public class ConcertHall {
    public static void main(String[] args) {
        ArrayList<Seat> seats = new ArrayList<>();
        seats.add(new Seat("Floor", 80.00));
        seats.add(new BoxSeat("East", 120.00, 75));
        seats.add(new Seat("Balcony", 60.00));
        seats.add(new Seat("West", 95.00));
        seats.add(new BoxSeat("North", 150.00, 20));

        System.out.println("=== Seats ===");
        for (Seat s : seats) {
            System.out.println(s);
        }
        System.out.println("Seats sold: " + Seat.getCount());

        double total = 0;
        int box = 0;
        Seat highest = seats.get(0);
        for (Seat s : seats) {
            total += s.getFinalPrice();
            if (s instanceof BoxSeat) {
                box++;
            }
            if (s.getFinalPrice() > highest.getFinalPrice()) {
                highest = s;
            }
        }
        System.out.println("Box seats: " + box);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Highest: " + highest);
    }
}
