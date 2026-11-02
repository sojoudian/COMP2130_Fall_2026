import java.util.ArrayList;

public class BookShop {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Emma", 18.00));
        books.add(new RareBook("Dracula", 40.00, 25));
        books.add(new Book("Ulysses", 22.50));
        books.add(new RareBook("Beloved", 36.00, 50));
        books.add(new Book("Hamlet", 12.00));

        System.out.println("=== Books ===");
        for (Book b : books) {
            System.out.println(b);
        }
        System.out.println("Books sold: " + Book.getCount());

        double total = 0;
        int rare = 0;
        Book highest = books.get(0);
        for (Book b : books) {
            total += b.getFinalPrice();
            if (b instanceof RareBook) {
                rare++;
            }
            if (b.getFinalPrice() > highest.getFinalPrice()) {
                highest = b;
            }
        }
        System.out.println("Rare books: " + rare);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Highest: " + highest);
    }
}
