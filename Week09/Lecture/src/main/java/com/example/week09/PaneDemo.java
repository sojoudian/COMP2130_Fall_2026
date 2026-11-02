package com.example.week09;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class PaneDemo extends Application {
    @Override
    public void start(Stage stage) {
        Circle circle = new Circle(60);
        Button btOK = new Button("OK");
        StackPane pane = new StackPane();
        pane.getChildren().addAll(circle, btOK);
        stage.setTitle("PaneDemo");
        stage.setScene(new Scene(pane, 250, 180));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
