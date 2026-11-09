package com.example.week10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CheckBoxDemo extends Application {
    @Override
    public void start(Stage stage) {
        Font normal = Font.font("Arial", 22);
        Font bold = Font.font("Arial", FontWeight.BOLD, 22);
        Text text = new Text(20, 45, "Java is fun");
        text.setFont(normal);
        CheckBox chkBold = new CheckBox("Bold");
        CheckBox chkUnder = new CheckBox("Underline");
        chkBold.setOnAction(e ->
                text.setFont(chkBold.isSelected() ? bold : normal));
        chkUnder.setOnAction(e -> text.setUnderline(chkUnder.isSelected()));
        VBox boxes = new VBox(10, chkBold, chkUnder);
        boxes.setPadding(new Insets(10));
        BorderPane pane = new BorderPane(new Pane(text));
        pane.setRight(boxes);
        stage.setTitle("CheckBoxDemo");
        stage.setScene(new Scene(pane, 290, 80));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
