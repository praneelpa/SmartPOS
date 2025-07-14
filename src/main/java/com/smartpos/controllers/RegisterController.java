package com.smartpos.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RegisterController {

  @FXML
  private TextField barcodeField;

  @FXML
  private Button scanButton;

  @FXML
  private void initialize() {
    scanButton.setOnAction(e -> scanProduct());
  }

  private void scanProduct() {
    String barcode = barcodeField.getText();

    if (barcode.isEmpty()) {
      showAlert("Error", "Please enter a barcode to scan.");
      return;
    }

    System.out.println("Scanned barcode: " + barcode);
    showAlert("Scanned!", "Scanned barcode: " + barcode);
    barcodeField.clear();
  }

  private void showAlert(String title, String message) {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle(title);
    alert.setContentText(message);
    alert.showAndWait();
  }
}