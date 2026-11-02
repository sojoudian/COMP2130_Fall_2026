public class GamingLaptop extends Laptop {
    private int gpuRate;

    public GamingLaptop(String brand, double price, int gpuRate) {
        super(brand, price);
        this.gpuRate = gpuRate;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + super.getFinalPrice() * gpuRate / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (gaming +" + gpuRate + "% = $" + String.format("%.2f", getFinalPrice()) + ")";
    }
}
