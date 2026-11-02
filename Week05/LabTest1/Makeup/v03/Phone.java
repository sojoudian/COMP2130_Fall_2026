public class Phone {
    private static int count = 0;
    private final int id;
    private String model;
    private double price;

    public Phone(String model, double price) {
        count++;
        id = count;
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
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
        return "#" + id + " " + model + " - $" + String.format("%.2f", price);
    }
}
