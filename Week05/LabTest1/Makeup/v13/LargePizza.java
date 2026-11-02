public class LargePizza extends Pizza {
    private int sizeRate;

    public LargePizza(String flavor, double price, int sizeRate) {
        super(flavor, price);
        this.sizeRate = sizeRate;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + super.getFinalPrice() * sizeRate / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (large +" + sizeRate + "% = $" + String.format("%.2f", getFinalPrice()) + ")";
    }
}
