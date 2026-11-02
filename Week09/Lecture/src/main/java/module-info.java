module com.example.week09 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.week09 to javafx.fxml, javafx.graphics;
}
