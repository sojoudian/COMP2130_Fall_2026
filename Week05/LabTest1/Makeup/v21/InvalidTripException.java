public class InvalidTripException extends Exception {
    public InvalidTripException(int km) {
        super("Invalid trip: " + km + " km");
    }
}
