import java.util.ArrayList;

public class Pizzeria {
    public static void main(String[] args) {
        ArrayList<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new LargePizza("Hawaiian", 14.00, 50));
        pizzas.add(new Pizza("Veggie", 13.50));
        pizzas.add(new Pizza("Cheese", 11.00));
        pizzas.add(new LargePizza("Pepperoni", 15.00, 30));
        pizzas.add(new Pizza("Supreme", 18.75));

        System.out.println("=== Pizzas ===");
        for (Pizza p : pizzas) {
            System.out.println(p);
        }
        System.out.println("Pizzas ordered: " + Pizza.getCount());

        double total = 0;
        int large = 0;
        Pizza highest = pizzas.get(0);
        for (Pizza p : pizzas) {
            total += p.getFinalPrice();
            if (p instanceof LargePizza) {
                large++;
            }
            if (p.getFinalPrice() > highest.getFinalPrice()) {
                highest = p;
            }
        }
        System.out.println("Large pizzas: " + large);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Highest: " + highest);
    }
}
