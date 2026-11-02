public class Meal {
    private static int count = 0;
    private final int id;
    private String dish;
    private double price;

    public Meal(String dish, double price) {
        count++;
        id = count;
        this.dish = dish;
        this.price = price;
    }

    public String getDish() {
        return dish;
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
        return "#" + id + " " + dish + " - $" + String.format("%.2f", price);
    }
}
