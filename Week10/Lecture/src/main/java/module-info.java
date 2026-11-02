module com.example.week10 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens com.example.week10 to javafx.fxml, javafx.graphics;
}
