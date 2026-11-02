public class Suite extends Room {
    private double serviceFee;

    public Suite(String type, double price, double serviceFee) {
        super(type, price);
        this.serviceFee = serviceFee;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + serviceFee;
    }

    @Override
    public String toString() {
        return super.toString() + " (service +$" + String.format("%.2f", serviceFee) + ")";
    }
}
