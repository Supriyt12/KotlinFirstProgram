module com.example.kotlinfirstprogram {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.kotlinfirstprogram to javafx.fxml;
    exports com.example.kotlinfirstprogram;
}