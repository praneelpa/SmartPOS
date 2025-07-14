package com.smartpos.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {

  @FXML
  private void openRegister(ActionEvent event) {
    try {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Register.fxml"));
      Stage stage = new Stage();
      stage.setTitle("Register");
      stage.setScene(new Scene(loader.load()));
      stage.show();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @FXML
  private void openProducts(ActionEvent event) {
    try {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ProductView.fxml"));
      Stage stage = new Stage();
      stage.setTitle("Product Management");
      stage.setScene(new Scene(loader.load()));
      stage.show();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}