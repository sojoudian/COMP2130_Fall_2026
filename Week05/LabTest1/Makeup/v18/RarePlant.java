public class RarePlant extends Plant {
    private int rareRate;

    public RarePlant(String species, double price, int rareRate) {
        super(species, price);
        this.rareRate = rareRate;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + super.getFinalPrice() * rareRate / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (rare +" + rareRate + "% = $" + String.format("%.2f", getFinalPrice()) + ")";
    }
}
