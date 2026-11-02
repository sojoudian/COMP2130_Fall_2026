public class ElectricBike extends Bike {
    private int batteryRate;

    public ElectricBike(String model, double price, int batteryRate) {
        super(model, price);
        this.batteryRate = batteryRate;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + super.getFinalPrice() * batteryRate / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (electric +" + batteryRate + "% = $" + String.format("%.2f", getFinalPrice()) + ")";
    }
}
