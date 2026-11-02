package com.example.week09;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Activity2Fix2 extends Application {
    @Override
    public void start(Stage stage) {
        Circle sun = new Circle(50);
        sun.setFill(Color.web("#FFC800"));  // CHANGED
        StackPane pane = new StackPane(sun);
        stage.setTitle("Activity2");
        stage.setScene(new Scene(pane, 200, 150));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
