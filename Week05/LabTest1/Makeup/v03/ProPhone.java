public class ProPhone extends Phone {
    private int boost;

    public ProPhone(String model, double price, int boost) {
        super(model, price);
        this.boost = boost;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + super.getFinalPrice() * boost / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (pro +" + boost + "% = $" + String.format("%.2f", getFinalPrice()) + ")";
    }
}
