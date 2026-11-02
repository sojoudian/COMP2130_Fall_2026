public class SmartWatch extends Watch {
    private int smartRate;

    public SmartWatch(String brand, double price, int smartRate) {
        super(brand, price);
        this.smartRate = smartRate;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + super.getFinalPrice() * smartRate / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (smart +" + smartRate + "% = $" + String.format("%.2f", getFinalPrice()) + ")";
    }
}
