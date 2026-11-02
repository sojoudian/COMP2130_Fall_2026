public class NightRide extends Ride {
    private int nightRate;

    public NightRide(String destination, double price, int nightRate) {
        super(destination, price);
        this.nightRate = nightRate;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + super.getFinalPrice() * nightRate / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (night +" + nightRate + "% = $" + String.format("%.2f", getFinalPrice()) + ")";
    }
}
