public class PremiumMembership extends Membership {
    private int premiumRate;

    public PremiumMembership(String plan, double price, int premiumRate) {
        super(plan, price);
        this.premiumRate = premiumRate;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + super.getFinalPrice() * premiumRate / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (premium +" + premiumRate + "% = $" + String.format("%.2f", getFinalPrice()) + ")";
    }
}
