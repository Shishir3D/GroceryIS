/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.skb.controller.algorithms;

import com.skb.model.ProductModel;
import java.util.List;
import com.skb.util.TableUpdator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shishir
 */
public class SelectionSort {

    public static void sort(List<ProductModel> products, String sortBy, boolean isAscending) {
        for (int i = 0; i < products.size() - 1; i++) {
            int selectedIndex = i;

            for (int j = i + 1; j < products.size(); j++) {
                boolean condition = false;

                if (sortBy.equalsIgnoreCase("price")) {
                    if (isAscending) {
                        if (products.get(j).getPrice() < products.get(selectedIndex).getPrice()) {
                            condition = true;
                        }
                    } else {
                        if (products.get(j).getPrice() > products.get(selectedIndex).getPrice()) {
                            condition = true;
                        }
                    }
                } else if (sortBy.equalsIgnoreCase("name")) {
                    if (isAscending) {
                        if (products.get(j).getProductName().compareTo(products.get(selectedIndex).getProductName()) < 0) {
                            condition = true;
                        }
                    } else {
                        if (products.get(j).getProductName().compareTo(products.get(selectedIndex).getProductName()) > 0) {
                            condition = true;
                        }
                    }
                } else if (sortBy.equalsIgnoreCase("quantity")) {
                    if (isAscending) {
                        if (products.get(j).getQuantity() < products.get(selectedIndex).getQuantity()) {
                            condition = true;
                        }
                    } else {
                        if (products.get(j).getQuantity() > products.get(selectedIndex).getQuantity()) {
                            condition = true;
                        }
                    }
                } else if (sortBy.equalsIgnoreCase("weight")) {
                    if (isAscending) {
                        if (products.get(j).getWeight().compareTo(products.get(selectedIndex).getWeight()) < 0) {
                            condition = true;
                        }
                    } else {
                        if (products.get(j).getWeight().compareTo(products.get(selectedIndex).getWeight()) > 0) {
                            condition = true;
                        }
                    }
                }

                if (condition) {
                    selectedIndex = j;
                }
            }

            // Swap the elements
            if (selectedIndex != i) {
                ProductModel temp = products.get(i);
                products.set(i, products.get(selectedIndex));
                products.set(selectedIndex, temp);
            }
        }
    }
    
    public void UpdateSortedDataInTable(JTable productTable){
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        model.setRowCount(0);
    }
}
