import java.util.ArrayList;

public class GymDesk {
    public static void main(String[] args) {
        ArrayList<Membership> memberships = new ArrayList<>();
        memberships.add(new Membership("Basic", 30.00));
        memberships.add(new PremiumMembership("Gold", 50.00, 60));
        memberships.add(new Membership("Student", 20.00));
        memberships.add(new Membership("Family", 75.00));
        memberships.add(new PremiumMembership("Silver", 40.00, 50));

        System.out.println("=== Memberships ===");
        for (Membership m : memberships) {
            System.out.println(m);
        }
        System.out.println("Memberships sold: " + Membership.getCount());

        double total = 0;
        int premium = 0;
        Membership highest = memberships.get(0);
        for (Membership m : memberships) {
            total += m.getFinalPrice();
            if (m instanceof PremiumMembership) {
                premium++;
            }
            if (m.getFinalPrice() > highest.getFinalPrice()) {
                highest = m;
            }
        }
        System.out.println("Premium memberships: " + premium);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Highest: " + highest);
    }
}
