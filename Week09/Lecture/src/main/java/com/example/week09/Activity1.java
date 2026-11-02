package com.example.week09;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Activity1 extends Application {
    @Override
    public void start(Stage stage) {
        Circle circle = new Circle(100, 75, 50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        Pane pane = new Pane();
        pane.getChildren().add(circle);
        stage.setTitle("Activity1");
        stage.setScene(new Scene(pane, 200, 150));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
