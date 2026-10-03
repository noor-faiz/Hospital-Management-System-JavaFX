package com.example.finalproject1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class UserRegController {

    @FXML
    private TextField nameText;

    @FXML
    private PasswordField passUserText;

    @FXML
    private TextField userText;


    @FXML
    void signUp(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Successful");
        alert.setContentText("Account Successfully created");
        alert.showAndWait();

        String name = this.nameText.getText();
        String pass = this.passUserText.getText();
        String user = this.userText.getText();

        PatientData patient = new PatientData(name, pass, user);

    }

    @FXML
    void homePageR(ActionEvent event) {
        HelloApplication.changeScene2("startForm");

    }

}

