import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {
        ArrayList<Meal> meals = new ArrayList<>();
        meals.add(new ComboMeal("Burger", 12.00, 25));
        meals.add(new Meal("Salad", 9.50));
        meals.add(new ComboMeal("Wrap", 10.00, 40));
        meals.add(new Meal("Pasta", 14.50));
        meals.add(new Meal("Soup", 6.00));

        System.out.println("=== Meals ===");
        for (Meal m : meals) {
            System.out.println(m);
        }
        System.out.println("Meals ordered: " + Meal.getCount());

        double total = 0;
        int combo = 0;
        Meal highest = meals.get(0);
        for (Meal m : meals) {
            total += m.getFinalPrice();
            if (m instanceof ComboMeal) {
                combo++;
            }
            if (m.getFinalPrice() > highest.getFinalPrice()) {
                highest = m;
            }
        }
        System.out.println("Combo meals: " + combo);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Highest: " + highest);
    }
}
