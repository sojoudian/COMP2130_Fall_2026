import java.util.Arrays;
import java.util.Locale;

public class DrinkApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        Coffee latte = new Coffee("Iced Latte", 5.25, 2);
        Coffee espresso = new Coffee("Espresso", 3.00, 1);
        Tea tea = new Tea("Green Tea", 3.50);
        Drink[] menu = {tea, latte, espresso};
        Arrays.sort(menu);
        System.out.println("=== Menu ===");
        for (Drink d : menu){
            System.out.println(d);
        }
        Coffee myFavoriteLatte = latte.clone();
        myFavoriteLatte.setShots(3);
        System.out.println("Original: " + latte);
        System.out.println("My favorite latte (the copy version): " + myFavoriteLatte);
    }
}



abstract class Drink implements Comparable<Drink>{
    private String name;
    private double price;

    public Drink(String name, double price){
        this.name = name;
        this.price = price;
    }
    public abstract int getCaffeine();

    @Override
    public int compareTo(Drink other){
        return Double.compare(price, other.price);
    }

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

    public void setShots(int shots){
        this.shots = shots;
    }
    @Override
    public int getCaffeine(){
        return shots * 60;
    }

    @Override
    public Coffee clone() throws CloneNotSupportedException {
        return (Coffee) super.clone();
    }
}


class Tea extends Drink {
    public Tea(String name, double price){
        super(name, price);
    }

    @Override
    public int getCaffeine(){
        return 30;
    }
}