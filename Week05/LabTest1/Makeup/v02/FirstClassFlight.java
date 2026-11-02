public class FirstClassFlight extends Flight {
    private int upgrade;

    public FirstClassFlight(String city, double price, int upgrade) {
        super(city, price);
        this.upgrade = upgrade;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + super.getFinalPrice() * upgrade / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (first class +" + upgrade + "% = $" + String.format("%.2f", getFinalPrice()) + ")";
    }
}
