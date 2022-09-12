module com.example.javafxleeson1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxleeson1 to javafx.fxml;
    exports com.example.javafxleeson1;
}