public class CertifiedWorkshop extends Workshop {
    private int certificateRate;

    public CertifiedWorkshop(String topic, double price, int certificateRate) {
        super(topic, price);
        this.certificateRate = certificateRate;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + super.getFinalPrice() * certificateRate / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (certified +" + certificateRate + "% = $" + String.format("%.2f", getFinalPrice()) + ")";
    }
}
