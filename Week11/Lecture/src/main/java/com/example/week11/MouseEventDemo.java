package com.example.week11;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventDemo extends Application {
    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        Text text = new Text(20, 20, "Programming is fun");
        pane.getChildren().add(text);
        text.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                text.setX(e.getX());
                text.setY(e.getY());
            }
        });
        stage.setTitle("MouseEventDemo");
        stage.setScene(new Scene(pane, 300, 100));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
