package com.example.week10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Activity2Fix extends Application {
    @Override
    public void start(Stage stage) {
        Label lblSize = new Label("Size: none");
        RadioButton rbSmall = new RadioButton("Small");
        RadioButton rbMedium = new RadioButton("Medium");
        RadioButton rbLarge = new RadioButton("Large");
        ToggleGroup group = new ToggleGroup();
        rbSmall.setToggleGroup(group);
        rbMedium.setToggleGroup(group);
        rbLarge.setToggleGroup(group);
        rbSmall.setOnAction(e -> lblSize.setText("Size: small"));
        rbMedium.setOnAction(e -> lblSize.setText("Size: medium"));
        rbLarge.setOnAction(e -> lblSize.setText("Size: large"));
        HBox sizes = new HBox(10, rbSmall, rbMedium, rbLarge);
        VBox pane = new VBox(10, sizes, lblSize);
        pane.setPadding(new Insets(10));
        stage.setTitle("Activity2");
        stage.setScene(new Scene(pane, 260, 70));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
