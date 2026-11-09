package com.example.week10;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ScrollBarDemo extends Application {
    @Override
    public void start(Stage stage) {
        Text text = new Text(20, 20, "JavaFX");
        Pane pane = new Pane(text);
        ScrollBar scbX = new ScrollBar();
        ScrollBar scbY = new ScrollBar();
        scbY.setOrientation(Orientation.VERTICAL);
        scbX.valueProperty().addListener(ov ->
                text.setX(scbX.getValue() * pane.getWidth() / scbX.getMax()));
        scbY.valueProperty().addListener(ov ->
                text.setY(scbY.getValue() * pane.getHeight() / scbY.getMax()));
        BorderPane root = new BorderPane(pane);
        root.setBottom(scbX);
        root.setRight(scbY);
        stage.setTitle("ScrollBarDemo");
        stage.setScene(new Scene(root, 300, 150));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
