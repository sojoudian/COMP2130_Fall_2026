package com.example.week11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LambdaHandlerDemo extends Application {
    @Override
    public void start(Stage stage) {
        Button btNew = new Button("New");
        Button btOpen = new Button("Open");
        Button btSave = new Button("Save");
        Button btPrint = new Button("Print");
        btNew.setOnAction((ActionEvent e) -> {
            System.out.println("Process New");
        });
        btOpen.setOnAction((e) -> {
            System.out.println("Process Open");
        });
        btSave.setOnAction(e -> {
            System.out.println("Process Save");
        });
        btPrint.setOnAction(e -> System.out.println("Process Print"));
        HBox pane = new HBox(10, btNew, btOpen, btSave, btPrint);
        pane.setAlignment(Pos.CENTER);
        stage.setTitle("LambdaHandlerDemo");
        stage.setScene(new Scene(pane, 300, 80));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
