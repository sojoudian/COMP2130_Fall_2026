import java.util.Locale;

public abstract class Vehicle implements Comparable<Vehicle>, Cloneable {
    private static int count = 0;
    private final int id;
    private String name;
    private int[] trips;

    public Vehicle(String name, int[] trips) throws InvalidTripException {
        for (int km : trips) {
            if (km <= 0) {
                throw new InvalidTripException(km);
            }
        }
        count++;
        id = count;
        this.name = name;
        this.trips = trips;
    }

    public static int getCount() {
        return count;
    }

    public int getTotalKm() {
        int total = 0;
        for (int km : trips) {
            total += km;
        }
        return total;
    }

    public abstract double getRate();

    public abstract String getType();

    public double getCost() {
        return getTotalKm() * getRate();
    }

    public double getFinalCost() {
        return getCost();
    }

    public void setTrip(int index, int km) {
        trips[index] = km;
    }

    @Override
    public String toString() {
        return "#" + id + " " + getType() + " " + name + ": " + getTotalKm() + " km, $"
                + String.format(Locale.US, "%.2f", getCost());
    }

    @Override
    public int compareTo(Vehicle other) {
        int result = Double.compare(other.getFinalCost(), getFinalCost());
        if (result == 0) {
            result = name.compareTo(other.name);
        }
        return result;
    }

    @Override
    public Vehicle clone() throws CloneNotSupportedException {
        Vehicle copy = (Vehicle) super.clone();
        copy.trips = trips.clone();
        return copy;
    }
}
