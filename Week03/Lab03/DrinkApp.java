public class DrinkApp {
    public static void main(String[] args){
        Drink[] menu = new Drink[3];
        menu[0] = new Drink("Iced Latte", 5.95);
        menu[1] = new Drink("Green Tea", 3.50);
        menu[2] = new Drink();

        System.out.println("=== Menu ===");
        for (Drink d : menu){
            System.out.println(d);
        }
        System.out.println("Drink created: " + Drink.getCount());

        Drink top = mostExpensive(menu);
        System.out.println("Most expensive: " + top.getName());

        applyDiscount(menu[0], 20);
        System.out.println("After 20% discount: " + menu[0]);

        System.out.println("=== Code ===");
        for (Drink d : menu) {
            System.out.println(d.getName() + " ----> " + makeCode(d.getName()));
        }
    }

    public static Drink mostExpensive(Drink[] drinks) {
        Drink max = drinks[0];
        for (int i = 1; i < drinks.length; i++) {
            if (drinks[i].getPrice() > max.getPrice()){
                max = drinks[i];
            }
        }
        return max;
    }

    public static void applyDiscount(Drink d, double percent){
        d.setPrice(d.getPrice() * (1 - percent / 100));  // water 1.00 Discount=20% ==> 1-(20/100) = 0.80
    }

    // Overloading: same method name, different parameter list
    public static void applyDiscount(Drink d){
        applyDiscount(d, 10);
    }

    public static String makeCode(String name){
        StringBuilder code = new StringBuilder();
        for (int i =0; i < name.length() && code.length() < 3; i++){
            char c = name.charAt(i);
            if (Character.isLetter(c)) {
                code.append(Character.toUpperCase(c));
            }
        }
        return code.toString();
    }
}
