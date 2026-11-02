public class Tour {
    private static int count = 0;
    private final int id;
    private String place;
    private double price;

    public Tour(String place, double price) {
        count++;
        id = count;
        this.place = place;
        this.price = price;
    }

    public String getPlace() {
        return place;
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
        return "#" + id + " " + place + " - $" + String.format("%.2f", price);
    }
}
