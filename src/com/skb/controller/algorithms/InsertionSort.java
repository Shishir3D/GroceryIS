package com.skb.controller.algorithms;

import com.skb.model.ProductModel;
import com.skb.util.TableUpdator;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author shishir
 */
public class InsertionSort {

    public static void InsertionSort(List<ProductModel> productList, String sortBy, boolean isAscending, JTable productTable) {
        for (int i = 1; i < productList.size(); i++) {
            ProductModel key = productList.get(i);
            int j = i - 1;

            while (j >= 0) {
                boolean condition = false;

                if (sortBy.equalsIgnoreCase("price")) {
                    if (isAscending) {
                        if (productList.get(j).getPrice() > key.getPrice()) {
                            condition = true;
                        }
                    } else {
                        if (productList.get(j).getPrice() < key.getPrice()) {
                            condition = true;
                        }
                    }
                } else if (sortBy.equalsIgnoreCase("name")) {
                    if (isAscending) {
                        if (productList.get(j).getProductName().compareTo(key.getProductName()) > 0) {
                            condition = true;
                        }
                    } else {
                        if (productList.get(j).getProductName().compareTo(key.getProductName()) < 0) {
                            condition = true;
                        }
                    }
                } else if (sortBy.equalsIgnoreCase("quantity")) {
                    if (isAscending) {
                        if (productList.get(j).getQuantity() > key.getQuantity()) {
                            condition = true;
                        }
                    } else {
                        if (productList.get(j).getQuantity() < key.getQuantity()) {
                            condition = true;
                        }
                    }
                } else if (sortBy.equalsIgnoreCase("weight")) {
                    float weightJ = Float.parseFloat(productList.get(j).getWeight());
                    float weightKey = Float.parseFloat(key.getWeight());
                    if (isAscending) {
                        if (weightJ > weightKey) {
                            condition = true;
                        }
                    } else {
                        if (weightJ < weightKey) {
                            condition = true;
                        }
                    }
                }

                if (condition) {
                    productList.set(j + 1, productList.get(j));
                    j--;
                } else {
                    break;
                }
            }

            productList.set(j + 1, key);
        }

        // Update the table after sorting is complete
        TableUpdator sortedTable = new TableUpdator();
        sortedTable.refreshProductTable(productTable, productList);
    }
}
