public class Ticket {
    private static int count = 0;
    private final int id;
    private String movie;
    private double price;

    public Ticket(String movie, double price) {
        count++;
        id = count;
        this.movie = movie;
        this.price = price;
    }

    public String getMovie() {
        return movie;
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
        return "#" + id + " " + movie + " - $" + String.format("%.2f", price);
    }
}
