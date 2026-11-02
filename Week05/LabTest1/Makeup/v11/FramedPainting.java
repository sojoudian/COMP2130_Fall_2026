public class FramedPainting extends Painting {
    private int frameRate;

    public FramedPainting(String title, double price, int frameRate) {
        super(title, price);
        this.frameRate = frameRate;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + super.getFinalPrice() * frameRate / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (framed +" + frameRate + "% = $" + String.format("%.2f", getFinalPrice()) + ")";
    }
}
