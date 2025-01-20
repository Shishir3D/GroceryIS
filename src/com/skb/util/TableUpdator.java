package com.skb.util;

import com.skb.model.ProductModel;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Utility class for managing and updating data in a JTable related to products.
 * Provides methods to register products, refresh the table, and clear all data.
 * 
 * <p>Designed to work with ProductModel objects and a JTable component.</p>
 * 
 * @author 23048645 Shishir Poudel
 */
public class TableUpdator {

    /**
     * Registers a new product, adds it to the product list, and updates the table.
     * 
     * @param item         The ProductModel object to register.
     * @param productList  The list to store product details.
     * @param productTable The JTable to update with the new product data.
     */
    public void registerProduct(ProductModel item, List<ProductModel> productList, JTable productTable) {
        // Add the product to the list
        productList.add(item);
        // Update the table with the new product data
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        model.addRow(new Object[]{
            item.getProductId(), item.getProductName(), item.getPrice(), 
            item.getQuantity(), item.getSupplier(), item.getWeight(), item.getWeightUnit()
        });
    }

    /**
     * Refreshes the JTable to reflect the current state of the product list.
     * 
     * @param productTable The JTable to update.
     * @param productList  The list containing the current product data.
     */
    public void refreshProductTable(JTable productTable, List<ProductModel> productList) {
        // Clear all existing rows from the table
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        model.setRowCount(0);

        // Add updated product data to the table
        for (ProductModel item : productList) {
            model.addRow(new Object[]{
                item.getProductId(), item.getProductName(), item.getPrice(), 
                item.getQuantity(), item.getSupplier(), item.getWeight(), item.getWeightUnit()
            });
        }

        // Log refresh activity
        System.out.println("inside refresh table");
    }

    /**
     * Removes all data from the JTable.
     * 
     * @param productTable The JTable to clear.
     */
    public void removeAllDataFromTable(JTable productTable) {
        // Clear all rows from the table
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        model.setRowCount(0);
    }
}
