public class Shoe {
    private static int count = 0;
    private final int id;
    private String brand;
    private double price;

    public Shoe(String brand, double price) {
        count++;
        id = count;
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
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
        return "#" + id + " " + brand + " - $" + String.format("%.2f", price);
    }
}
