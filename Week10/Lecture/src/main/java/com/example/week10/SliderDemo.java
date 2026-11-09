package com.example.week10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class SliderDemo extends Application {
    @Override
    public void start(Stage stage) {
        Pane paneForCircle = new Pane();
        Circle circle = new Circle(20, Color.TEAL);
        circle.centerXProperty().bind(paneForCircle.widthProperty().divide(2));
        circle.centerYProperty().bind(paneForCircle.heightProperty().divide(2));
        paneForCircle.getChildren().add(circle);
        Slider sldRadius = new Slider(10, 60, 20);
        sldRadius.setShowTickLabels(true);
        sldRadius.setShowTickMarks(true);
        sldRadius.setMajorTickUnit(10);
        circle.radiusProperty().bind(sldRadius.valueProperty());
        BorderPane pane = new BorderPane(paneForCircle);
        pane.setBottom(sldRadius);
        pane.setPadding(new Insets(10));
        stage.setTitle("SliderDemo");
        stage.setScene(new Scene(pane, 300, 200));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
