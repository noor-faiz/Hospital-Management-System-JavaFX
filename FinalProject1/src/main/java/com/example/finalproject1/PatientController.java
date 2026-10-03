package com.example.finalproject1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class PatientController {
    @FXML
    void logoutP(){
        HelloApplication.changeScene3("user1");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Successful");
        alert.setContentText("Successfully Logged out");
        alert.showAndWait();
    }
}
