public class VipTicket extends Ticket {
    private double fee;

    public VipTicket(String movie, double price, double fee) {
        super(movie, price);
        this.fee = fee;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + fee;
    }

    @Override
    public String toString() {
        return super.toString() + " (VIP +$" + String.format("%.2f", fee) + ")";
    }
}
