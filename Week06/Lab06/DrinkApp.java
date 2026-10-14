import java.util.Locale;

public class DrinkApp {
    public static void main(String[] args) {
        Coffee latte = new Coffee("Iced Latte", 5.25, 2);
        Coffee espresso = new Coffee("Espresso", 3.00, 1);
        Drink[] menu = {latte, espresso};
        System.out.println("=== Menu ===");
        for (Drink d : menu){
            System.out.println(d);
        }
    }
}

abstract class Drink{
    private String name;
    private double price;

    public Drink(String name, double price){
        this.name = name;
        this.price = price;
    }
    public abstract int getCaffeine();

    @Override
    public String toString(){
        String text = String.format(Locale.US, "%.2f", price);
        return name + " - $" + text + ", caffeine: " + getCaffeine() + " mg";
    }
}

class Coffee extends Drink{
    private int shots;
    public Coffee(String name, double price, int shots){
        super(name, price);
        this.shots = shots;
    }
    @Override
    public int getCaffeine(){
        return shots * 60;
    }
}