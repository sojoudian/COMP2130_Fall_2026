import java.util.ArrayList;

public class DrinkApp {
    public static void  main(String[] args){
        ArrayList<Drink> menu = new ArrayList<>();
        menu.add(new Drink("Green Tea", 3.50));
        menu.add(new Coffee("Iced Latte", 5.25, 2));
        menu.add(new Coffee("Espresso", 3.00, 1));

        System.out.println("==== Menu ====");
        for (Drink d : menu){
            System.out.println(d);
        }


    }
}
