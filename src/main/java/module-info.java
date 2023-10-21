module com.example.calculator1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculator1 to javafx.fxml;
    exports com.example.calculator1;
}