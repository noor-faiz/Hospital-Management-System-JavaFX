module com.example.finalproject1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finalproject1 to javafx.fxml;
    exports com.example.finalproject1;
}