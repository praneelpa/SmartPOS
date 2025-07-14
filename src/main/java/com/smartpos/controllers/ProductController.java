package com.smartpos.controllers;

import com.smartpos.models.Product;
import com.smartpos.services.DatabaseService;
import com.smartpos.utils.AlertUtils;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ProductController {

  @FXML
  private TextField productNameField;

  @FXML
  private TextField priceField;

  public void saveProduct() {
    String name = productNameField.getText();
    String price = priceField.getText();

    if (name.isEmpty() || price.isEmpty()) {
      AlertUtils.showError("Please fill all fields.");
      return;
    }

    Product product = new Product(name, Double.parseDouble(price));
    DatabaseService.saveProduct(product);

    AlertUtils.showInfo("Product saved successfully.");
  }
}