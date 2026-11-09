package com.example.week10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextAreaDemo extends Application {
    @Override
    public void start(Stage stage) {
        TextField tfItem = new TextField();
        Button btAdd = new Button("Add");
        TextArea taList = new TextArea();
        taList.setPrefColumnCount(20);
        taList.setPrefRowCount(4);
        taList.setWrapText(true);
        taList.setEditable(false);
        btAdd.setOnAction(e -> {
            taList.appendText(tfItem.getText() + "\n");
            tfItem.clear();
        });
        HBox row = new HBox(10, tfItem, btAdd);
        VBox pane = new VBox(10, row, taList);
        pane.setPadding(new Insets(10));
        stage.setTitle("TextAreaDemo");
        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
