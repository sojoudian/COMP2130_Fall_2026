package com.example.lab09;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WeatherCard extends Application {
    @Override
    public void start(Stage stage) {
        Pane sky = new Pane();
        Rectangle background = new Rectangle();
        background.widthProperty().bind(sky.widthProperty());
        background.heightProperty().bind(sky.heightProperty());
        background.setFill(Color.LIGHTSKYBLUE);
        Circle sun = new Circle(40, Color.GOLD);
        sun.centerXProperty().bind(sky.widthProperty().divide(2));
        sun.centerYProperty().bind(sky.heightProperty().divide(2));
        sky.getChildren().addAll(background, sun);
        Text city = new Text("Toronto");
        city.setFont(Font.font("Arial", FontWeight.BOLD, 28));
        city.setFill(Color.rgb(25, 25, 112));
        Image image = new Image(getClass().getResource("cloud.png").toExternalForm());
        ImageView cloud = new ImageView(image);
        cloud.setFitWidth(80);
        cloud.setPreserveRatio(true);
        HBox days = new HBox(20, new Label("Mon 18°C"), new Label("Tue 15°C"),
                new Label("Wed 12°C"));
        days.setPadding(new Insets(10));
        BorderPane root = new BorderPane(sky);
        root.setTop(city);
        root.setLeft(cloud);
        root.setBottom(days);
        stage.setTitle("Weather");
        stage.setScene(new Scene(root, 400, 300));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
