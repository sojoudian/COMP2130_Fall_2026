public class Room {
    private static int count = 0;
    private final int id;
    private String type;
    private double price;

    public Room(String type, double price) {
        count++;
        id = count;
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
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
        return "#" + id + " " + type + " - $" + String.format("%.2f", price);
    }
}
