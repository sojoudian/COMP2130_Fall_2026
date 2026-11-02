public class Truck extends Vehicle {
    private int axles;

    public Truck(String name, int axles, int[] trips) throws InvalidTripException {
        super(name, trips);
        this.axles = axles;
    }

    @Override
    public double getRate() {
        return 0.75 * axles;
    }

    @Override
    public String getType() {
        return "Truck";
    }

    @Override
    public double getCost() {
        double cost = super.getCost();
        if (cost < 200) {
            cost = 200;
        }
        return cost;
    }
}
