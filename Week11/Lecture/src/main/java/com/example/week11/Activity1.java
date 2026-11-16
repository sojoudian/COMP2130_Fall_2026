package com.example.week11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Activity1 extends Application {
    @Override
    public void start(Stage stage) {
        Button btA = new Button("A");
        Button btB = new Button("B");
        Button btC = new Button("C");
        CountHandler handler = new CountHandler();
        btA.setOnAction(handler);
        btB.setOnAction(handler);
        btC.setOnAction(new CountHandler());
        HBox pane = new HBox(10, btA, btB, btC);
        pane.setAlignment(Pos.CENTER);
        stage.setTitle("Activity1");
        stage.setScene(new Scene(pane, 240, 80));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class CountHandler implements EventHandler<ActionEvent> {
    private int count = 0;

    @Override
    public void handle(ActionEvent e) {
        count++;
        Button bt = (Button) e.getSource();
        System.out.println(bt.getText() + " " + count);
    }
}
