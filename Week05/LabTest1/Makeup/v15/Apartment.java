public class Apartment {
    private static int count = 0;
    private final int id;
    private String street;
    private double price;

    public Apartment(String street, double price) {
        count++;
        id = count;
        this.street = street;
        this.price = price;
    }

    public String getStreet() {
        return street;
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
        return "#" + id + " " + street + " - $" + String.format("%.2f", price);
    }
}
