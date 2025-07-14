package com.smartpos.services;

import com.smartpos.models.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseService {

  private static final String DB_URL = "jdbc:sqlite:database/smartpos.db";

  public static void saveProduct(Product product) {
    String sql = "INSERT INTO products (name, price) VALUES (?, ?)";
    try (Connection conn = DriverManager.getConnection(DB_URL);
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setString(1, product.getName());
      pstmt.setDouble(2, product.getPrice());
      pstmt.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}