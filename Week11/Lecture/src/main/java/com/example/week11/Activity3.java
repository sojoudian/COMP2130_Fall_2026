package com.example.week11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Activity3 extends Application {
    @Override
    public void start(Stage stage) {
        Circle circle = new Circle(100, 80, 30, Color.ORANGE);
        Pane pane = new Pane(circle);
        circle.setOnMouseClicked(e -> {
            if (e.getButton() == MouseButton.PRIMARY) {
                circle.setRadius(circle.getRadius() + 10);
            } else if (e.getButton() == MouseButton.SECONDARY) {
                circle.setRadius(circle.getRadius() - 10);
            }
        });
        pane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) {
                circle.setRadius(circle.getRadius() + 5);
            }
        });
        stage.setTitle("Activity3");
        stage.setScene(new Scene(pane, 200, 160));
        stage.show();
        pane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
