/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.skb.util;

import com.skb.model.ProductModel;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shishir
 */
public class TableUpdator {
    // Method to add product data and populate the table
    public void registerProduct(ProductModel item, List<ProductModel> productList, JTable productTable) {
        productList.add(item);
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        model.addRow(new Object[]{
            item.getProductId(),item.getProductName(), item.getPrice(), item.getQuantity(), item.getSupplier(), item.getWeight(), item.getWeightUnit()
        });
    }
    
    public void refreshProductTable(JTable productTable, List<ProductModel> productList) {
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        model.setRowCount(0); // Clear existing rows

        for (ProductModel item : productList) {
            model.addRow(new Object[]{
            item.getProductId(),item.getProductName(), item.getPrice(), item.getQuantity(), item.getSupplier(), item.getWeight(), item.getWeightUnit()
        });
        }
        
        System.out.println("inside refresh table");
    }
    
    public void removeAllDataFromTable(JTable productTable) {
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        model.setRowCount(0);
    }
}
