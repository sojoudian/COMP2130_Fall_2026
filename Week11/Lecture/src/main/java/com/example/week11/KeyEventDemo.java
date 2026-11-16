package com.example.week11;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyEventDemo extends Application {
    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        Text text = new Text(20, 20, "A");
        pane.getChildren().add(text);
        text.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent e) {
                KeyCode code = e.getCode();
                if (code == KeyCode.DOWN) text.setY(text.getY() + 10);
                else if (code == KeyCode.UP) text.setY(text.getY() - 10);
                else if (code == KeyCode.LEFT) text.setX(text.getX() - 10);
                else if (code == KeyCode.RIGHT) text.setX(text.getX() + 10);
                else if (code.isLetterKey()) text.setText(e.getText());
            }
        });
        stage.setTitle("KeyEventDemo");
        stage.setScene(new Scene(pane, 200, 100));
        stage.show();
        text.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
