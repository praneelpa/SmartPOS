package com.smartpos.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ProductController {

  @FXML
  private TextField productNameField;

  @FXML
  private TextField priceField;

  @FXML
  private Button saveButton;

  @FXML
  private void initialize() {
    saveButton.setOnAction(e -> saveProduct());
  }

  private void saveProduct() {
    String name = productNameField.getText();
    String priceText = priceField.getText();

    if (name.isEmpty() || priceText.isEmpty()) {
      showAlert("Validation Error", "Please enter product name and price.");
      return;
    }

    try {
      double price = Double.parseDouble(priceText);
      System.out.println("Product saved: " + name + " ($" + price + ")");
      showAlert("Success", "Product saved: " + name);
      productNameField.clear();
      priceField.clear();
    } catch (NumberFormatException e) {
      showAlert("Validation Error", "Price must be a valid number.");
    }
  }

  private void showAlert(String title, String message) {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle(title);
    alert.setContentText(message);
    alert.showAndWait();
  }
}