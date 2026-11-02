package com.example.week09;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FontDemo extends Application {
    @Override
    public void start(Stage stage) {
        Circle circle = new Circle(60);
        circle.setFill(Color.rgb(255, 230, 150));
        circle.setStroke(Color.BLACK);
        Label label = new Label("JavaFX");
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD,
                FontPosture.ITALIC, 24));
        StackPane pane = new StackPane(circle, label);
        stage.setTitle("FontDemo");
        stage.setScene(new Scene(pane, 250, 160));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
