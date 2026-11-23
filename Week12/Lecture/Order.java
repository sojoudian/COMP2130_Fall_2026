import java.io.*;
import java.util.*;

public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    private String item;
    private int cups;

    public Order(String item, int cups) {
        this.item = item;
        this.cups = cups;
    }

    @Override
    public String toString() { return cups + " x " + item; }
}