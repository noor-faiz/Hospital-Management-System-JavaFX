package com.example.finalproject1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class AdminController {
    @FXML
    void logoutA(){
        HelloApplication.changeScene3("user1");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Successful");
        alert.setContentText("Successfully Logged out");
        alert.showAndWait();
    }

    @FXML
    void data(){
        HelloApplication.changeScene3("stat");
    }
}
