package com.example.week11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Week11 extends Application {
    private final Pane canvas = new Pane();
    private final List<Circle> dots = new ArrayList<>();
    private final Label lblInfo = new Label("Dots: 0, red: 0");
    private Color color = Color.BLUE;

    @Override
    public void start(Stage stage) {
        DotHandler handler = new DotHandler();
        canvas.setOnMousePressed(handler);
        canvas.setOnMouseDragged(handler);
        Button btClear = new Button("Clear");
        btClear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                canvas.getChildren().clear();
                dots.clear();
                update();
            }
        });
        Button btUndo = new Button("Undo");
        btUndo.setOnAction(e -> {
            if (!dots.isEmpty()) {
                canvas.getChildren().remove(dots.remove(dots.size() - 1));
                update();
            }
        });
        HBox bar = new HBox(10, btClear, btUndo, lblInfo);
        bar.setPadding(new Insets(10));
        BorderPane root = new BorderPane(canvas);
        root.setBottom(bar);
        Scene scene = new Scene(root, 400, 300);
        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.R) color = Color.RED;
            else if (e.getCode() == KeyCode.B) color = Color.BLUE;
        });
        stage.setTitle("Dot Painter");
        stage.setScene(scene);
        stage.show();
    }

    private void update() {
        long red = dots.stream().filter(d -> d.getFill().equals(Color.RED)).count();
        lblInfo.setText("Dots: " + dots.size() + ", red: " + red);
    }

    class DotHandler implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            Circle dot = new Circle(e.getX(), e.getY(), 6, color);
            dots.add(dot);
            canvas.getChildren().add(dot);
            update();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
