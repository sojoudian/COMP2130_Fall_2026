public class Ride {
    private static int count = 0;
    private final int id;
    private String destination;
    private double price;

    public Ride(String destination, double price) {
        count++;
        id = count;
        this.destination = destination;
        this.price = price;
    }

    public String getDestination() {
        return destination;
    }

    public double getPrice() {
        return price;
    }

    public static int getCount() {
        return count;
    }

    public double getFinalPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "#" + id + " " + destination + " - $" + String.format("%.2f", price);
    }
}
