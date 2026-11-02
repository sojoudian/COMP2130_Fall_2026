public class RareBook extends Book {
    private int rarity;

    public RareBook(String title, double price, int rarity) {
        super(title, price);
        this.rarity = rarity;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + super.getFinalPrice() * rarity / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (rare +" + rarity + "% = $" + String.format("%.2f", getFinalPrice()) + ")";
    }
}
