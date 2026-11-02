package com.example.week09;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Activity3 extends Application {
    @Override
    public void start(Stage stage) {
        GridPane pane = new GridPane();
        pane.setHgap(20);
        pane.setVgap(10);
        pane.add(new Label("A"), 1, 0);
        pane.add(new Label("B"), 0, 1);
        pane.add(new Label("C"), 1, 1);
        pane.add(new Label("D"), 2, 0);
        stage.setTitle("Activity3");
        stage.setScene(new Scene(pane, 200, 100));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
