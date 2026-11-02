package com.example.week09;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShowShapes extends Application {
    @Override
    public void start(Stage stage) {
        Line line = new Line(10, 10, 110, 60);
        Rectangle rect = new Rectangle(130, 10, 90, 50);
        rect.setArcWidth(20);
        rect.setArcHeight(20);
        rect.setFill(Color.LIGHTBLUE);
        Ellipse ellipse = new Ellipse(285, 35, 45, 25);
        ellipse.setFill(Color.ORANGE);
        Arc arc = new Arc(60, 120, 40, 40, 30, 120);
        arc.setType(ArcType.ROUND);
        arc.setFill(Color.SEAGREEN);
        Polygon triangle = new Polygon(130, 150, 175, 80, 220, 150);
        triangle.setFill(Color.GOLD);
        Text text = new Text(245, 125, "Shapes");
        text.setFont(Font.font("Arial", 22));
        Pane pane = new Pane(line, rect, ellipse, arc, triangle, text);
        stage.setTitle("ShowShapes");
        stage.setScene(new Scene(pane, 340, 170));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
