package com.example.finalproject1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class User1Controller implements Initializable {

    @FXML
    private ComboBox<String> comboL;

    @FXML
    private PasswordField passTextL;

    @FXML
    private TextField userTextL;

    @FXML
    void login(ActionEvent event) {
        if(comboL.getSelectionModel().getSelectedItem().equals("Patient")) {
            HelloApplication.changeScene3("patientController");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Successful");
            alert.setContentText("Successfully Logged in");
            alert.showAndWait();
        } else if (comboL.getSelectionModel().getSelectedItem().equals("Doctor")) {
            HelloApplication.changeScene3("doctorController");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Successful");
            alert.setContentText("Successfully Logged in");
            alert.showAndWait();

        } else if (comboL.getSelectionModel().getSelectedItem().equals("Receptionist")) {
            HelloApplication.changeScene3("receptionistController");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Successful");
            alert.setContentText("Successfully Logged in");
            alert.showAndWait();

        } else if (comboL.getSelectionModel().getSelectedItem().equals("Admin")) {
            HelloApplication.changeScene3("adminController");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Successful");
            alert.setContentText("Successfully Logged in");
            alert.showAndWait();

        } else if (comboL.getSelectionModel().getSelectedItem().equals("Pharmacist")) {
            HelloApplication.changeScene3("pharmacistController");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Successful");
            alert.setContentText("Successfully Logged in");
            alert.showAndWait();

        } else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Failed");
            alert.setContentText("Please select a user type!");
            alert.showAndWait();
        }

    }


    @FXML
    void homePageL(ActionEvent event) {
        HelloApplication.changeScene2("startForm");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> dressTypes = FXCollections.observableArrayList();
        dressTypes.add("Patient");
        dressTypes.add("Doctor");
        dressTypes.add("Admin");
        dressTypes.add("Pharmacist");
        dressTypes.add("Receptionist");
        comboL.setItems(dressTypes);

    }

}

