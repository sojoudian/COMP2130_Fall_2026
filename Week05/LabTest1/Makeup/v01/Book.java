public class Book {
    private static int count = 0;
    private final int id;
    private String title;
    private double price;

    public Book(String title, double price) {
        count++;
        id = count;
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
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
        return "#" + id + " " + title + " - $" + String.format("%.2f", price);
    }
}
