package com.smartpos.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {

  @FXML
  private void openRegister(ActionEvent event) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("/fxml/Register.fxml"));
    Stage stage = new Stage();
    stage.setTitle("Register");
    stage.setScene(new Scene(root));
    stage.show();
  }

  @FXML
  private void openProducts(ActionEvent event) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("/fxml/ProductView.fxml"));
    Stage stage = new Stage();
    stage.setTitle("Products");
    stage.setScene(new Scene(root));
    stage.show();
  }
}