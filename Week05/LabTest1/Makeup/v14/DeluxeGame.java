public class DeluxeGame extends Game {
    private int deluxeRate;

    public DeluxeGame(String title, double price, int deluxeRate) {
        super(title, price);
        this.deluxeRate = deluxeRate;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + super.getFinalPrice() * deluxeRate / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (deluxe +" + deluxeRate + "% = $" + String.format("%.2f", getFinalPrice()) + ")";
    }
}
