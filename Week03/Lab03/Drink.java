public class Drink {
    private static int count = 0;
    private final int id;
    private String name;
    private double price;

    public Drink(){
        this("Water", 1.00);
    }

    public Drink(String name, double price) {
        count++;
        this.id = count;
        this.name = name;
        setPrice(price);
    }
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if (price < 0) {
            System.out.println("Error: price cannot be negative. Price set to 0");
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public static int getCount(){
        return count;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("#").append(id)
                .append(" ").append(name)
                .append(" - $").append(String.format("%.2f", price));
        return sb.toString();
    }

}













