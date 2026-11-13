package com.example.lab10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class VideoPlayer extends Application {
    @Override
    public void start(Stage stage) {
        Media media = new Media(getClass().getResource("clip.mp4").toExternalForm());
        MediaPlayer mpClip = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mpClip);
        Button btPlay = new Button("Play");
        btPlay.setOnAction(e -> {
            if (btPlay.getText().equals("Play")) {
                mpClip.play();
                btPlay.setText("Pause");
            } else {
                mpClip.pause();
                btPlay.setText("Play");
            }
        });
        Button btRewind = new Button("Rewind");
        btRewind.setOnAction(e -> mpClip.seek(Duration.ZERO));
        HBox controls = new HBox(10, btPlay, btRewind);
        controls.setPadding(new Insets(10));
        Slider sldVolume = new Slider(0, 100, 50);
        sldVolume.setShowTickMarks(true);
        sldVolume.setShowTickLabels(true);
        mpClip.volumeProperty().bind(sldVolume.valueProperty().divide(100));
        CheckBox chkMute = new CheckBox("Mute");
        chkMute.setOnAction(e -> mpClip.setMute(chkMute.isSelected()));
        controls.getChildren().addAll(new Label("Volume"), sldVolume, chkMute);
        TextField tfNote = new TextField();
        TextArea taNotes = new TextArea();
        taNotes.setEditable(false);
        taNotes.setPrefColumnCount(15);
        tfNote.setOnAction(e -> {
            double seconds = mpClip.getCurrentTime().toSeconds();
            taNotes.appendText(String.format("%.1f s: %s%n", seconds, tfNote.getText()));
            tfNote.clear();
        });
        VBox notes = new VBox(10, new Label("Note (press Enter):"), tfNote, taNotes);
        notes.setPadding(new Insets(10));
        BorderPane root = new BorderPane(mediaView);
        root.setBottom(controls);
        root.setRight(notes);
        stage.setTitle("Video Player");
        stage.setScene(new Scene(root, 560, 300));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
