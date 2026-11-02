public class ExpressParcel extends Parcel {
    private int expressRate;

    public ExpressParcel(String city, double price, int expressRate) {
        super(city, price);
        this.expressRate = expressRate;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + super.getFinalPrice() * expressRate / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (express +" + expressRate + "% = $" + String.format("%.2f", getFinalPrice()) + ")";
    }
}
