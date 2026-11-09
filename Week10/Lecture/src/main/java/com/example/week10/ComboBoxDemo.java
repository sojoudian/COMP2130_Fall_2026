package com.example.week10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ComboBoxDemo extends Application {
    @Override
    public void start(Stage stage) {
        ComboBox<String> cboCity = new ComboBox<>();
        cboCity.getItems().addAll("Toronto", "Montreal", "Vancouver");
        cboCity.setValue("Toronto");
        Label lblCity = new Label("City: Toronto");
        cboCity.setOnAction(e ->
                lblCity.setText("City: " + cboCity.getValue()));
        HBox pane = new HBox(10, cboCity, lblCity);
        pane.setPadding(new Insets(10));
        stage.setTitle("ComboBoxDemo");
        stage.setScene(new Scene(pane, 300, 50));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
