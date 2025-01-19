package com.skb.controller.algorithms;

import com.skb.model.ProductModel;
import java.util.List;
import com.skb.util.TableUpdator;
import javax.swing.JTable;


/**
 *
 * @author shishir
 */
public class SelectionSort {

    public static void SelectionSort(List<ProductModel> productList, String sortBy, boolean isAscending, JTable productTable) {
        for (int i = 0; i < productList.size() - 1; i++) {
            int selectedIndex = i;

            for (int j = i + 1; j < productList.size(); j++) {
                boolean condition = false;

                if (sortBy.equalsIgnoreCase("price")) {
                    if (isAscending) {
                        if (productList.get(j).getPrice() < productList.get(selectedIndex).getPrice()) {
                            condition = true;
                        }
                    } else {
                        if (productList.get(j).getPrice() > productList.get(selectedIndex).getPrice()) {
                            condition = true;
                        }
                    }
                } else if (sortBy.equalsIgnoreCase("name")) {
                    if (isAscending) {
                        if (productList.get(j).getProductName().compareTo(productList.get(selectedIndex).getProductName()) < 0) {
                            condition = true;
                        }
                    } else {
                        if (productList.get(j).getProductName().compareTo(productList.get(selectedIndex).getProductName()) > 0) {
                            condition = true;
                        }
                    }
                } else if (sortBy.equalsIgnoreCase("quantity")) {
                    if (isAscending) {
                        if (productList.get(j).getQuantity() < productList.get(selectedIndex).getQuantity()) {
                            condition = true;
                        }
                    } else {
                        if (productList.get(j).getQuantity() > productList.get(selectedIndex).getQuantity()) {
                            condition = true;
                        }
                    }
                } else if (sortBy.equalsIgnoreCase("weight")) {
                    float weightJ = Float.parseFloat(productList.get(j).getWeight());
                    float weightSelected = Float.parseFloat(productList.get(selectedIndex).getWeight());
                    if (isAscending) {
                        if (weightJ < weightSelected) {
                            condition = true;
                        }
                    } else {
                        if (weightJ > weightSelected) {
                            condition = true;
                        }
                    }
                }

                if (condition) {
                    selectedIndex = j;
                }
            }

            // Swap the elements after the inner loop
            if (selectedIndex != i) {
                ProductModel temp = productList.get(i);
                productList.set(i, productList.get(selectedIndex));
                productList.set(selectedIndex, temp);
            }
        }

        // Update the table after sorting is complete
        TableUpdator sortedTable = new TableUpdator();
        sortedTable.refreshProductTable(productTable, productList);
    }
}
