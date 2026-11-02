import java.util.ArrayList;

public class Gallery {
    public static void main(String[] args) {
        ArrayList<Painting> paintings = new ArrayList<>();
        paintings.add(new FramedPainting("Dawn", 300.00, 30));
        paintings.add(new Painting("Harbor", 410.00));
        paintings.add(new Painting("Storm", 275.00));
        paintings.add(new Painting("Meadow", 380.00));
        paintings.add(new FramedPainting("Bloom", 320.00, 25));

        System.out.println("=== Paintings ===");
        for (Painting p : paintings) {
            System.out.println(p);
        }
        System.out.println("Paintings sold: " + Painting.getCount());

        double total = 0;
        int framed = 0;
        Painting highest = paintings.get(0);
        for (Painting p : paintings) {
            total += p.getFinalPrice();
            if (p instanceof FramedPainting) {
                framed++;
            }
            if (p.getFinalPrice() > highest.getFinalPrice()) {
                highest = p;
            }
        }
        System.out.println("Framed paintings: " + framed);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Highest: " + highest);
    }
}
