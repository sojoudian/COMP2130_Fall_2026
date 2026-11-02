public class OnlineCourse extends Course {
    private int platformRate;

    public OnlineCourse(String topic, double price, int platformRate) {
        super(topic, price);
        this.platformRate = platformRate;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + super.getFinalPrice() * platformRate / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (online +" + platformRate + "% = $" + String.format("%.2f", getFinalPrice()) + ")";
    }
}
