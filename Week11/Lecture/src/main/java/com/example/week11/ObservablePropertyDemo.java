package com.example.week11;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class ObservablePropertyDemo {
    public static void main(String[] args) {
        DoubleProperty balance = new SimpleDoubleProperty();
        balance.addListener(ov ->
                System.out.println("Value: " + balance.get()));
        balance.set(4.5);
        balance.set(7);
        balance.set(7);
    }
}
