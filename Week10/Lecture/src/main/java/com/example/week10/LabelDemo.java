package com.example.week10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class LabelDemo extends Application {
    @Override
    public void start(Stage stage) {
        Label lblText = new Label("Text only");
        lblText.setTextFill(Color.RED);
        Label lblBox = new Label("Box", new Rectangle(40, 30, Color.TEAL));
        Label lblSun = new Label("Sun", new Circle(15, Color.GOLD));
        lblSun.setContentDisplay(ContentDisplay.BOTTOM);
        HBox pane = new HBox(20, lblText, lblBox, lblSun);
        pane.setPadding(new Insets(10));
        stage.setTitle("LabelDemo");
        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
