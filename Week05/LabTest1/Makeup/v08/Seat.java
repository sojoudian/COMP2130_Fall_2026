public class Seat {
    private static int count = 0;
    private final int id;
    private String section;
    private double price;

    public Seat(String section, double price) {
        count++;
        id = count;
        this.section = section;
        this.price = price;
    }

    public String getSection() {
        return section;
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
        return "#" + id + " " + section + " - $" + String.format("%.2f", price);
    }
}
