package com.example.week11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AnonymousHandlerDemo extends Application {
    @Override
    public void start(Stage stage) {
        Button btNew = new Button("New");
        Button btOpen = new Button("Open");
        btNew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("Process New");
            }
        });
        btOpen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("Process Open");
            }
        });
        HBox pane = new HBox(10, btNew, btOpen);
        pane.setAlignment(Pos.CENTER);
        stage.setTitle("AnonymousHandlerDemo");
        stage.setScene(new Scene(pane, 240, 80));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
