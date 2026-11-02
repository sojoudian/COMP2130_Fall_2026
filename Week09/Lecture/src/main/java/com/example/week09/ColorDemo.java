package com.example.week09;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ColorDemo extends Application {
    @Override
    public void start(Stage stage) {
        Rectangle r1 = new Rectangle(10, 10, 70, 70);
        r1.setFill(Color.RED);
        Rectangle r2 = new Rectangle(90, 10, 70, 70);
        r2.setFill(new Color(0.0, 0.5, 1.0, 1.0));
        Rectangle r3 = new Rectangle(170, 10, 70, 70);
        r3.setFill(Color.rgb(255, 165, 0));
        Rectangle r4 = new Rectangle(250, 10, 70, 70);
        r4.setFill(Color.web("#2E8B57", 0.5));
        Pane pane = new Pane(r1, r2, r3, r4);
        stage.setTitle("ColorDemo");
        stage.setScene(new Scene(pane, 330, 90));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
