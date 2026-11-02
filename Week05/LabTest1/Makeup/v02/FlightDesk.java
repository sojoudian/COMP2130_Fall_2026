import java.util.ArrayList;

public class FlightDesk {
    public static void main(String[] args) {
        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Paris", 420.00));
        flights.add(new FirstClassFlight("Tokyo", 900.00, 40));
        flights.add(new Flight("Lima", 610.00));
        flights.add(new FirstClassFlight("Rome", 500.00, 30));
        flights.add(new Flight("Cairo", 380.00));

        System.out.println("=== Flights ===");
        for (Flight f : flights) {
            System.out.println(f);
        }
        System.out.println("Flights booked: " + Flight.getCount());

        double total = 0;
        int firstClass = 0;
        Flight highest = flights.get(0);
        for (Flight f : flights) {
            total += f.getFinalPrice();
            if (f instanceof FirstClassFlight) {
                firstClass++;
            }
            if (f.getFinalPrice() > highest.getFinalPrice()) {
                highest = f;
            }
        }
        System.out.println("First class flights: " + firstClass);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Highest: " + highest);
    }
}
