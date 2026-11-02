package com.example.week09;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShowHBoxVBox extends Application {
    @Override
    public void start(Stage stage) {
        HBox top = new HBox(10, new Button("Save"), new Button("Open"));
        top.setPadding(new Insets(10));
        VBox left = new VBox(10, new Label("Week 9"), new Label("Week 10"),
                new Label("Week 11"));
        left.setPadding(new Insets(10));
        BorderPane pane = new BorderPane();
        pane.setTop(top);
        pane.setLeft(left);
        stage.setTitle("ShowHBoxVBox");
        stage.setScene(new Scene(pane, 260, 160));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
