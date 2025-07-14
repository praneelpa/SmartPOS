package com.smartpos.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AlertUtils {
  public static void showError(String message) {
    Alert alert = new Alert(AlertType.ERROR);
    alert.setContentText(message);
    alert.showAndWait();
  }

  public static void showInfo(String message) {
    Alert alert = new Alert(AlertType.INFORMATION);
    alert.setContentText(message);
    alert.showAndWait();
  }
}