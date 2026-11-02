public class Flight {
    private static int count = 0;
    private final int id;
    private String city;
    private double price;

    public Flight(String city, double price) {
        count++;
        id = count;
        this.city = city;
        this.price = price;
    }

    public String getCity() {
        return city;
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
        return "#" + id + " " + city + " - $" + String.format("%.2f", price);
    }
}
