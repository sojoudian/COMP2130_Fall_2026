package com.example.week09;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {
    @Override
    public void start(Stage stage) {
        FlowPane pane = new FlowPane(10, 10);
        pane.setPadding(new Insets(10));
        pane.getChildren().addAll(new Label("First Name:"), new TextField(),
                new Label("Last Name:"), new TextField());
        stage.setTitle("ShowFlowPane");
        stage.setScene(new Scene(pane, 380, 100));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
