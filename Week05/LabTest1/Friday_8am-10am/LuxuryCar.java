public class LuxuryCar extends Car {
    private double insurance;

    public LuxuryCar(String model, double price, double insurance) {
        super(model, price);
        this.insurance = insurance;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + insurance;
    }

    @Override
    public String toString() {
        return super.toString() + " (insurance +$" + String.format("%.2f", insurance) + ")";
    }
}
