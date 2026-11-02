import java.util.ArrayList;

public class PhoneStore {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new ProPhone("Nova", 600.00, 15));
        phones.add(new Phone("Zen", 450.00));
        phones.add(new Phone("Arc", 720.00));
        phones.add(new ProPhone("Volt", 640.00, 25));
        phones.add(new Phone("Echo", 300.00));

        System.out.println("=== Phones ===");
        for (Phone p : phones) {
            System.out.println(p);
        }
        System.out.println("Phones sold: " + Phone.getCount());

        double total = 0;
        int pro = 0;
        Phone highest = phones.get(0);
        for (Phone p : phones) {
            total += p.getFinalPrice();
            if (p instanceof ProPhone) {
                pro++;
            }
            if (p.getFinalPrice() > highest.getFinalPrice()) {
                highest = p;
            }
        }
        System.out.println("Pro phones: " + pro);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Highest: " + highest);
    }
}
