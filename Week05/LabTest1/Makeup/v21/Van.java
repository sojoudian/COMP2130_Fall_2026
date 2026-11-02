public class Van extends Vehicle {
    private int load;

    public Van(String name, int load, int[] trips) throws InvalidTripException {
        super(name, trips);
        this.load = load;
    }

    @Override
    public double getRate() {
        return 0.90 + load / 100 * 0.10;
    }

    @Override
    public String getType() {
        return "Van";
    }
}
