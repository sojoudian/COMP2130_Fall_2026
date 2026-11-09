package com.example.week10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ButtonDemo extends Application {
    @Override
    public void start(Stage stage) {
        Text text = new Text(50, 40, "JavaFX");
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right");
        btLeft.setOnAction(e -> text.setX(text.getX() - 10));
        btRight.setOnAction(e -> text.setX(text.getX() + 10));
        HBox buttons = new HBox(10, btLeft, btRight);
        buttons.setAlignment(Pos.CENTER);
        buttons.setPadding(new Insets(10));
        BorderPane pane = new BorderPane(new Pane(text));
        pane.setBottom(buttons);
        stage.setTitle("ButtonDemo");
        stage.setScene(new Scene(pane, 250, 120));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
