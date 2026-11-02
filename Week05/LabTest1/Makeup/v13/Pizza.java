public class Pizza {
    private static int count = 0;
    private final int id;
    private String flavor;
    private double price;

    public Pizza(String flavor, double price) {
        count++;
        id = count;
        this.flavor = flavor;
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
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
        return "#" + id + " " + flavor + " - $" + String.format("%.2f", price);
    }
}
