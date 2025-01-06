/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.skb.util;

import com.skb.model.ProductModel;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.*;
import com.skb.util.TableUpdator;
import java.util.List;

/**
 *
 * @author shishir
 */
public class Validation {

    public void addButtonValidation(JTextField tfProductSupplier, JTextField tfProductQuantity, JTextField tfProductUnit, JTextField tfProductWeight, JTextField tfProductId, JTextField tfProductPrice, JTextField tfProductName, List<ProductModel> productList, JTable productTable) {
        // Validate Product Supplier
        if (tfProductSupplier.getText().trim().isEmpty()) {
            tfProductSupplier.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Product Supplier cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            tfProductSupplier.requestFocus();
            return;
        }

        // Validate Product Quantity
        try {
            int quantity = Integer.parseInt(tfProductQuantity.getText().trim());
            if (quantity <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            tfProductQuantity.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Product Quantity must be a positive integer.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            tfProductQuantity.requestFocus();
            return;
        }

        // Validate Product Unit
        if (tfProductUnit.getText().trim().isEmpty()) {
            tfProductUnit.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Product Unit cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            tfProductUnit.requestFocus();
            return;
        }

        // Validate Product Weight
        try {
            double weight = Double.parseDouble(tfProductWeight.getText().trim());
            if (weight <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            tfProductWeight.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Product Weight must be a positive number.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            tfProductWeight.requestFocus();
            return;
        }

        // Validate Product ID
        if (tfProductId.getText().trim().isEmpty()) {
            tfProductId.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Product ID cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            tfProductId.requestFocus();
            return;
        }

        // Validate Product Price
        try {
            double price = Double.parseDouble(tfProductPrice.getText().trim());
            if (price <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            tfProductPrice.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Product Price must be a positive number.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            tfProductPrice.requestFocus();
            return;
        }

        // Validate Product Name
        if (tfProductName.getText().trim().isEmpty()) {
            tfProductName.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Product Name cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            tfProductName.requestFocus();
            return;
        }

        for (ProductModel product : productList) {
            if (product.getProductId() == Integer.parseInt(tfProductId.getText().trim())) {
                JOptionPane.showMessageDialog(null, "That ID already exists! Enter a new ID.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // If all validations pass
        JOptionPane.showMessageDialog(null, "Product added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

        try {
            int productId = Integer.parseInt(tfProductId.getText().trim());
            String productName = tfProductName.getText().trim();
            String weight = tfProductWeight.getText().trim();
            String weightUnit = tfProductUnit.getText().trim();
            String supplier = tfProductSupplier.getText().trim();
            double price = Double.parseDouble(tfProductPrice.getText().trim());
            int quantity = Integer.parseInt(tfProductQuantity.getText().trim());

            // Create ProductModel object and register it
            ProductModel product = new ProductModel(productId, productName, weight, weightUnit, supplier, price, quantity);

            TableUpdator registerItem = new TableUpdator();
            registerItem.registerProduct(product, productList, productTable);

            TableUpdator refreshItems = new TableUpdator();
            refreshItems.refreshProductTable(productTable, productList);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please ensure numeric fields are correctly filled.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updateButtonValidation(JTextField tfProductSupplier1, JTextField tfProductQuantity1, JTextField tfProductUnit1, JTextField tfProductWeight1, JTextField tfProductId1, JTextField tfProductPrice1, JTextField tfProductName1, List<ProductModel> productList, JTable productTable) {

        if (tfProductSupplier1.getText().trim().isEmpty()) {
            tfProductSupplier1.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Product Supplier cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            tfProductSupplier1.requestFocus();
            return;
        }

        // Validate Product Quantity
        try {
            int quantity = Integer.parseInt(tfProductQuantity1.getText().trim());
            if (quantity <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            tfProductQuantity1.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Product Quantity must be a positive integer.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            tfProductQuantity1.requestFocus();
            return;
        }

        // Validate Product Unit
        if (tfProductUnit1.getText().trim().isEmpty()) {
            tfProductUnit1.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Product Unit cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            tfProductUnit1.requestFocus();
            return;
        }

        // Validate Product Weight
        try {
            double weight = Double.parseDouble(tfProductWeight1.getText().trim());
            if (weight <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            tfProductWeight1.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Product Weight must be a positive number.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            tfProductWeight1.requestFocus();
            return;
        }

        // Validate Product ID
        if (tfProductId1.getText().trim().isEmpty()) {
            tfProductId1.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Product ID cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            tfProductId1.requestFocus();
            return;
        }

        // Validate Product Price
        try {
            double price = Double.parseDouble(tfProductPrice1.getText().trim());
            if (price <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            tfProductPrice1.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Product Price must be a positive number.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            tfProductPrice1.requestFocus();
            return;
        }

        // Validate Product Name
        if (tfProductName1.getText().trim().isEmpty()) {
            tfProductName1.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Product Name cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            tfProductName1.requestFocus();
            return;
        }

        // If all validations pass
        try {
            int productId = Integer.parseInt(tfProductId1.getText().trim());
            String productName = tfProductName1.getText().trim();
            String weight = tfProductWeight1.getText().trim();
            String weightUnit = tfProductUnit1.getText().trim();
            String supplier = tfProductSupplier1.getText().trim();
            double price = Double.parseDouble(tfProductPrice1.getText().trim());
            int quantity = Integer.parseInt(tfProductQuantity1.getText().trim());

            // Update the product in the product list or table
            ProductModel product = findProductById(productId, productList); // Helper method to find the product by ID
            if (product != null) {
                product.setProductName(productName);
                product.setWeight(weight);
                product.setWeightUnit(weightUnit);
                product.setSupplier(supplier);
                product.setPrice(price);
                product.setQuantity(quantity);

                TableUpdator refreshItems = new TableUpdator();
                refreshItems.refreshProductTable(productTable, productList);// Refresh the table view after updating
                JOptionPane.showMessageDialog(null, "Product updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Product with the given ID not found.", "Update Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please ensure numeric fields are correctly filled.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void removeButtonValidation(JTextField tfProductName2, List<ProductModel> productList, JTable productTable) {

        if (tfProductName2.getText().trim().isEmpty()) {
            tfProductName2.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Product ID cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            tfProductName2.requestFocus();
            return;
        }

        try {
            // Parse the Product ID
            int productId = Integer.parseInt(tfProductName2.getText().trim());

            // Search and remove the product by ID
            boolean productRemoved = false;
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getProductId() == productId) {
                    productList.remove(i);
                    productRemoved = true;
                    break;
                }
            }

            if (productRemoved) {
                TableUpdator refreshTable = new TableUpdator();
                refreshTable.refreshProductTable(productTable, productList);// Refresh the table to reflect changes
                JOptionPane.showMessageDialog(null, "Product removed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Product with the given ID not found.", "Removal Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            tfProductName2.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Invalid Product ID. Please enter a valid integer.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            tfProductName2.requestFocus();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private ProductModel findProductById(int productId, List<ProductModel> productList) {
        for (ProductModel product : productList) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }
}
