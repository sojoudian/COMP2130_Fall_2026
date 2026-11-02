public class ComboMeal extends Meal {
    private int comboRate;

    public ComboMeal(String dish, double price, int comboRate) {
        super(dish, price);
        this.comboRate = comboRate;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + super.getFinalPrice() * comboRate / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " (combo +" + comboRate + "% = $" + String.format("%.2f", getFinalPrice()) + ")";
    }
}
