package com.example.week10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MediaDemo extends Application {
    @Override
    public void start(Stage stage) {
        String url = getClass().getResource("clip.mp4").toExternalForm();
        MediaPlayer mpClip = new MediaPlayer(new Media(url));
        MediaView mediaView = new MediaView(mpClip);
        Button btPlay = new Button("Play");
        Button btPause = new Button("Pause");
        Button btRewind = new Button("Rewind");
        btPlay.setOnAction(e -> mpClip.play());
        btPause.setOnAction(e -> mpClip.pause());
        btRewind.setOnAction(e -> mpClip.seek(Duration.ZERO));
        Slider sldVolume = new Slider(0, 100, 50);
        mpClip.volumeProperty().bind(sldVolume.valueProperty().divide(100));
        HBox controls = new HBox(10, btPlay, btPause, btRewind, sldVolume);
        controls.setPadding(new Insets(10));
        BorderPane pane = new BorderPane(mediaView);
        pane.setBottom(controls);
        stage.setTitle("MediaDemo");
        stage.setScene(new Scene(pane, 400, 230));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
