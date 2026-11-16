package com.example.week11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircle extends Application {
    private final Circle circle = new Circle(30, Color.LIGHTBLUE);

    @Override
    public void start(Stage stage) {
        Button btEnlarge = new Button("Enlarge");
        btEnlarge.setOnAction(new EnlargeHandler());
        VBox pane = new VBox(10, circle, btEnlarge);
        pane.setAlignment(Pos.CENTER);
        stage.setTitle("ControlCircle");
        stage.setScene(new Scene(pane, 240, 200));
        stage.show();
    }

    class EnlargeHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            circle.setRadius(circle.getRadius() + 10);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
