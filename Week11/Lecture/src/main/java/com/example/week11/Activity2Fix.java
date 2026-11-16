package com.example.week11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Activity2Fix extends Application {
    private int clicks = 0;

    @Override
    public void start(Stage stage) {
        Label lblInfo = new Label("Click a button");
        Button btA = new Button("A");
        Button btB = new Button("B");
        Button btC = new Button("C");
        Button btD = new Button("D");
        btA.setOnAction(e -> lblInfo.setText("A"));
        btB.setOnAction((ActionEvent e) -> lblInfo.setText("B"));
        btC.setOnAction(e -> { lblInfo.setText("C"); });
        btD.setOnAction(e -> {
            clicks++;
            lblInfo.setText("D " + clicks);
        });
        VBox pane = new VBox(10, new HBox(10, btA, btB, btC, btD), lblInfo);
        stage.setTitle("Activity2");
        stage.setScene(new Scene(pane, 240, 80));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
