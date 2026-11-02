public class BoxSeat extends Seat {
    private int boxRate;

    public BoxSeat(String section, double price, int boxRate) {
        super(section, price);
        this.boxRate = boxRate;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + super.getFinalPrice() * boxRate / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (box +" + boxRate + "% = $" + String.format("%.2f", getFinalPrice()) + ")";
    }
}
