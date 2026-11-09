package com.example.week10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TextFieldDemo extends Application {
    @Override
    public void start(Stage stage) {
        TextField tfName = new TextField();
        PasswordField pfPin = new PasswordField();
        Label lblMsg = new Label();
        tfName.setOnAction(e -> lblMsg.setText("Hello, " + tfName.getText()));
        pfPin.setOnAction(e ->
                lblMsg.setText("PIN length: " + pfPin.getText().length()));
        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(10));
        pane.add(new Label("Name:"), 0, 0);
        pane.add(tfName, 1, 0);
        pane.add(new Label("PIN:"), 0, 1);
        pane.add(pfPin, 1, 1);
        pane.add(lblMsg, 1, 2);
        stage.setTitle("TextFieldDemo");
        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
