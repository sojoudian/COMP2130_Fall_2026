import java.util.ArrayList;

public class TicketApp {
    public static void main(String[] args) {
        ArrayList<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket("Dune", 12.50));
        tickets.add(new VipTicket("Dune", 12.50, 5.00));
        tickets.add(new Ticket("Up", 9.00));

        System.out.println("=== Tickets ===");
        for (Ticket t : tickets) {
            System.out.println(t);
        }
        System.out.println("Tickets sold: " + Ticket.getCount());

        double total = 0;
        int vip = 0;
        for (Ticket t : tickets) {
            total += t.getFinalPrice();
            if (t instanceof VipTicket) {
                vip++;
            }
        }
        System.out.println("VIP tickets: " + vip);
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
