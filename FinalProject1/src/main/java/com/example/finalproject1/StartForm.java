package com.example.finalproject1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class StartForm {

    @FXML
    void login0(ActionEvent event) {
        System.out.println("Login");
        HelloApplication.changeScene("user1");

    }

    @FXML
    void register(ActionEvent event) {
        System.out.println("Register");
        HelloApplication.changeScene("userRegController");

    }

}
