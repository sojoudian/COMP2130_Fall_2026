import java.util.ArrayList;

public class HotelApp {
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room("Single", 120.00));
        rooms.add(new Suite("Ocean View", 250.00, 40.00));
        rooms.add(new Room("Double", 160.00));

        System.out.println("=== Rooms ===");
        for (Room r : rooms) {
            System.out.println(r);
        }
        System.out.println("Rooms booked: " + Room.getCount());

        double total = 0;
        int suites = 0;
        for (Room r : rooms) {
            total += r.getFinalPrice();
            if (r instanceof Suite) {
                suites++;
            }
        }
        System.out.println("Suites: " + suites);
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
