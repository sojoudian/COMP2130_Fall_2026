package com.example.week10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ListViewDemo extends Application {
    @Override
    public void start(Stage stage) {
        ListView<String> lvFruit = new ListView<>();
        lvFruit.getItems().addAll("Apple", "Banana", "Cherry", "Grape");
        lvFruit.setPrefSize(110, 110);
        lvFruit.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        Label lblPicked = new Label("Selected: []");
        lvFruit.getSelectionModel().selectedItemProperty().addListener(ov ->
                lblPicked.setText("Selected: "
                        + lvFruit.getSelectionModel().getSelectedItems()));
        HBox pane = new HBox(10, lvFruit, lblPicked);
        pane.setPadding(new Insets(10));
        stage.setTitle("ListViewDemo");
        stage.setScene(new Scene(pane, 300, 130));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
