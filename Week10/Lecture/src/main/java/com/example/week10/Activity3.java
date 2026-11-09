package com.example.week10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Activity3 extends Application {
    @Override
    public void start(Stage stage) {
        ListView<String> lvColor = new ListView<>();
        lvColor.getItems().addAll("Red", "Green", "Blue");
        lvColor.setPrefSize(100, 80);
        Label lblPicked = new Label("Selected: []");
        lvColor.getSelectionModel().selectedItemProperty().addListener(ov ->
                lblPicked.setText("Selected: "
                        + lvColor.getSelectionModel().getSelectedItems()));
        HBox pane = new HBox(10, lvColor, lblPicked);
        pane.setPadding(new Insets(10));
        stage.setTitle("Activity3");
        stage.setScene(new Scene(pane, 280, 100));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
