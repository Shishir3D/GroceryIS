package com.skb.controller.algorithms;

import com.skb.model.ProductModel;
import com.skb.util.TableUpdator;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author shishir
 */
public class MergeSort {

    public static void MergeSort(List<ProductModel> productList, String sortBy, boolean isAscending, JTable productTable) {
        if (productList.size() < 2) {
            return;
        }

        int mid = productList.size() / 2;

        // Create copies of the left and right halves
        List<ProductModel> left = new ArrayList<>(productList.subList(0, mid));
        List<ProductModel> right = new ArrayList<>(productList.subList(mid, productList.size()));

        MergeSort(left, sortBy, isAscending, null); // Recursive call for left half
        MergeSort(right, sortBy, isAscending, null); // Recursive call for right half

        merge(productList, left, right, sortBy, isAscending);

        // Update the table after the final merge
        if (productTable != null) {
            TableUpdator sortedTable = new TableUpdator();
            sortedTable.refreshProductTable(productTable, productList);
        }
    }

    private static void merge(List<ProductModel> products, List<ProductModel> left, List<ProductModel> right, String sortBy, boolean isAscending) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            boolean condition = false;

            if (sortBy.equalsIgnoreCase("price")) {
                if (isAscending) {
                    condition = left.get(i).getPrice() <= right.get(j).getPrice();
                } else {
                    condition = left.get(i).getPrice() >= right.get(j).getPrice();
                }
            } else if (sortBy.equalsIgnoreCase("name")) {
                if (isAscending) {
                    condition = left.get(i).getProductName().compareTo(right.get(j).getProductName()) <= 0;
                } else {
                    condition = left.get(i).getProductName().compareTo(right.get(j).getProductName()) >= 0;
                }
            } else if (sortBy.equalsIgnoreCase("quantity")) {
                if (isAscending) {
                    condition = left.get(i).getQuantity() <= right.get(j).getQuantity();
                } else {
                    condition = left.get(i).getQuantity() >= right.get(j).getQuantity();
                }
            } else if (sortBy.equalsIgnoreCase("weight")) {
                float weightLeft = Float.parseFloat(left.get(i).getWeight());
                float weightRight = Float.parseFloat(right.get(j).getWeight());
                if (isAscending) {
                    condition = weightLeft <= weightRight;
                } else {
                    condition = weightLeft >= weightRight;
                }
            }

            if (condition) {
                products.set(k++, left.get(i++));
            } else {
                products.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            products.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            products.set(k++, right.get(j++));
        }
    }
}
