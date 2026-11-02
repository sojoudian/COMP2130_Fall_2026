package com.example.week09;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircleCentered extends Application {
    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        Circle circle = new Circle(50);
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        pane.getChildren().add(circle);
        stage.setTitle("ShowCircleCentered");
        stage.setScene(new Scene(pane, 200, 150));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
