package com.example.week09;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
    @Override
    public void start(Stage stage) {
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200, 150);
        stage.setTitle("MyJavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
