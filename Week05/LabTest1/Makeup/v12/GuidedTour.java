public class GuidedTour extends Tour {
    private int guideRate;

    public GuidedTour(String place, double price, int guideRate) {
        super(place, price);
        this.guideRate = guideRate;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + super.getFinalPrice() * guideRate / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (guided +" + guideRate + "% = $" + String.format("%.2f", getFinalPrice()) + ")";
    }
}
