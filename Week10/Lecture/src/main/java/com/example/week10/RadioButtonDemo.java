package com.example.week10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RadioButtonDemo extends Application {
    @Override
    public void start(Stage stage) {
        Text text = new Text(20, 55, "Java is fun");
        text.setFont(Font.font("Arial", 22));
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbGreen = new RadioButton("Green");
        RadioButton rbBlue = new RadioButton("Blue");
        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbBlue.setToggleGroup(group);
        rbRed.setOnAction(e -> text.setFill(Color.RED));
        rbGreen.setOnAction(e -> text.setFill(Color.GREEN));
        rbBlue.setOnAction(e -> text.setFill(Color.BLUE));
        VBox buttons = new VBox(10, rbRed, rbGreen, rbBlue);
        buttons.setPadding(new Insets(10));
        BorderPane pane = new BorderPane(new Pane(text));
        pane.setLeft(buttons);
        stage.setTitle("RadioButtonDemo");
        stage.setScene(new Scene(pane, 260, 100));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
