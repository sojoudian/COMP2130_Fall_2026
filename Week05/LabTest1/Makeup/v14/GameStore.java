import java.util.ArrayList;

public class GameStore {
    public static void main(String[] args) {
        ArrayList<Game> games = new ArrayList<>();
        games.add(new Game("Tetris", 20.00));
        games.add(new DeluxeGame("Halo", 60.00, 25));
        games.add(new Game("Zelda", 70.00));
        games.add(new Game("Doom", 45.00));
        games.add(new DeluxeGame("Portal", 48.00, 50));

        System.out.println("=== Games ===");
        for (Game g : games) {
            System.out.println(g);
        }
        System.out.println("Games sold: " + Game.getCount());

        double total = 0;
        int deluxe = 0;
        Game highest = games.get(0);
        for (Game g : games) {
            total += g.getFinalPrice();
            if (g instanceof DeluxeGame) {
                deluxe++;
            }
            if (g.getFinalPrice() > highest.getFinalPrice()) {
                highest = g;
            }
        }
        System.out.println("Deluxe games: " + deluxe);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Highest: " + highest);
    }
}
