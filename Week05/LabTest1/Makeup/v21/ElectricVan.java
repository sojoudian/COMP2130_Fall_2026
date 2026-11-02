import java.util.Locale;

public class ElectricVan extends Van implements Discountable {
    private int percent;

    public ElectricVan(String name, int load, int percent, int[] trips) throws InvalidTripException {
        super(name, load, trips);
        this.percent = percent;
    }

    @Override
    public String getType() {
        return "E-Van";
    }

    @Override
    public int getPercent() {
        return percent;
    }

    @Override
    public double getFinalCost() {
        return getCost() - getDiscount(getCost());
    }

    @Override
    public String toString() {
        return super.toString() + ", discount $" + String.format(Locale.US, "%.2f", getDiscount(getCost()))
                + ", pay $" + String.format(Locale.US, "%.2f", getFinalCost());
    }
}
