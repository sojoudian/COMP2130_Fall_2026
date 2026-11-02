package com.example.week09;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ShowImage extends Application {
    @Override
    public void start(Stage stage) {
        String url = getClass().getResource("cafe.png").toExternalForm();
        Image image = new Image(url);
        ImageView full = new ImageView(image);
        ImageView small = new ImageView(image);
        small.setFitWidth(60);
        small.setPreserveRatio(true);
        ImageView turned = new ImageView(image);
        turned.setRotate(90);
        HBox box = new HBox(10, full, small, turned);
        box.setPadding(new Insets(10));
        stage.setTitle("ShowImage");
        stage.setScene(new Scene(box));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
