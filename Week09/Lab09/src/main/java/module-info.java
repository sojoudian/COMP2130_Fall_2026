module com.example.lab09 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.lab09 to javafx.fxml, javafx.graphics;
}
