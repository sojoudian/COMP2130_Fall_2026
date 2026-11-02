public class Plant {
    private static int count = 0;
    private final int id;
    private String species;
    private double price;

    public Plant(String species, double price) {
        count++;
        id = count;
        this.species = species;
        this.price = price;
    }

    public String getSpecies() {
        return species;
    }

    public double getPrice() {
        return price;
    }

    public static int getCount() {
        return count;
    }

    public double getFinalPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "#" + id + " " + species + " - $" + String.format("%.2f", price);
    }
}
