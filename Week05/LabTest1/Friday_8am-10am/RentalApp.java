import java.util.ArrayList;

public class RentalApp {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Corolla", 45.00));
        cars.add(new LuxuryCar("BMW X5", 90.00, 20.00));
        cars.add(new Car("Civic", 40.00));

        System.out.println("=== Cars ===");
        for (Car c : cars) {
            System.out.println(c);
        }
        System.out.println("Cars rented: " + Car.getCount());

        double total = 0;
        int luxury = 0;
        for (Car c : cars) {
            total += c.getFinalPrice();
            if (c instanceof LuxuryCar) {
                luxury++;
            }
        }
        System.out.println("Luxury cars: " + luxury);
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
