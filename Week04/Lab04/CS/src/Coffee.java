public class Coffee extends Drink {
    private int shots;

    public Coffee(String name, double price, int shots){
        super(name, price);
        this.shots = shots;
    }


    public int getShots() {
        return shots;
    }

    @Override
    public String toString(){
        return super.toString() + ", shots: " + shots;
    }

}
