package com.example.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class IRController {
    @FXML
    private AnchorPane welcomePage;
    
    @FXML
    void onGettingStartedClicked(ActionEvent event) throws IOException {

        welcomePage.getScene().getWindow().hide();
        Stage homeStage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HomePanel.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 553);
        homeStage.setTitle("My Search Engine");
        homeStage.setScene(scene);
        homeStage.setResizable(false);
        homeStage.show();
    }
}