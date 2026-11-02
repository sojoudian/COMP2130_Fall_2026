public class Membership {
    private static int count = 0;
    private final int id;
    private String plan;
    private double price;

    public Membership(String plan, double price) {
        count++;
        id = count;
        this.plan = plan;
        this.price = price;
    }

    public String getPlan() {
        return plan;
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
        return "#" + id + " " + plan + " - $" + String.format("%.2f", price);
    }
}
