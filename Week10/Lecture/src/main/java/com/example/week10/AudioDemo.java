package com.example.week10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class AudioDemo extends Application {
    @Override
    public void start(Stage stage) {
        String url = getClass().getResource("ding.mp3").toExternalForm();
        MediaPlayer mpDing = new MediaPlayer(new Media(url));
        Button btPlay = new Button("Play the sound");
        btPlay.setOnAction(e -> {
            mpDing.stop();
            mpDing.play();
        });
        CheckBox chkMute = new CheckBox("Mute");
        chkMute.setOnAction(e -> mpDing.setMute(chkMute.isSelected()));
        HBox pane = new HBox(10, btPlay, chkMute);
        pane.setPadding(new Insets(10));
        stage.setTitle("AudioDemo");
        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
