module com.example.lab10 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens com.example.lab10 to javafx.fxml, javafx.graphics;
}
