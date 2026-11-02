public interface Discountable {
    int MAX_PERCENT = 30;

    int getPercent();

    default double getDiscount(double amount) {
        int percent = getPercent();
        if (percent > MAX_PERCENT) {
            percent = MAX_PERCENT;
        }
        return amount * percent / 100;
    }
}
