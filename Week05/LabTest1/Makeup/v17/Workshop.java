public class Workshop {
    private static int count = 0;
    private final int id;
    private String topic;
    private double price;

    public Workshop(String topic, double price) {
        count++;
        id = count;
        this.topic = topic;
        this.price = price;
    }

    public String getTopic() {
        return topic;
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
        return "#" + id + " " + topic + " - $" + String.format("%.2f", price);
    }
}
