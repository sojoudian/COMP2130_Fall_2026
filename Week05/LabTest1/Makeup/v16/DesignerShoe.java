public class DesignerShoe extends Shoe {
    private int designerRate;

    public DesignerShoe(String brand, double price, int designerRate) {
        super(brand, price);
        this.designerRate = designerRate;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + super.getFinalPrice() * designerRate / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (designer +" + designerRate + "% = $" + String.format("%.2f", getFinalPrice()) + ")";
    }
}
