package com.example.week10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Activity1 extends Application {
    @Override
    public void start(Stage stage) {
        Label lblWord = new Label("Go");
        Button btA = new Button("A");
        Button btB = new Button("B");
        btA.setOnAction(e -> lblWord.setText(lblWord.getText() + "A"));
        btB.setOnAction(e -> lblWord.setText("B"));
        HBox pane = new HBox(10, btA, btB, lblWord);
        pane.setPadding(new Insets(10));
        stage.setTitle("Activity1");
        stage.setScene(new Scene(pane, 200, 50));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
