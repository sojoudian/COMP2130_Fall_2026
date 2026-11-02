public class FurnishedApartment extends Apartment {
    private int furnitureRate;

    public FurnishedApartment(String street, double price, int furnitureRate) {
        super(street, price);
        this.furnitureRate = furnitureRate;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + super.getFinalPrice() * furnitureRate / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (furnished +" + furnitureRate + "% = $" + String.format("%.2f", getFinalPrice()) + ")";
    }
}
