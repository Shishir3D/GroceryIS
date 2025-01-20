package com.skb.controller.algorithms;
import com.skb.model.ProductModel;
import com.skb.util.TableUpdator;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

/**
 * Implementation of Merge Sort for sorting ProductModel objects.
 *
 * @author 23048645 Shishir Poudel
 */
public class MergeSort {

    // Merges two sublists into the main list.
    private static void merge(List<ProductModel> products, List<ProductModel> left, List<ProductModel> right, String sortBy, boolean isAscending) {
        int i = 0, j = 0, k = 0;

        // Merge while both sublists have elements
        while (i < left.size() && j < right.size()) {
            boolean condition = false;

            // Determine condition based on sortBy parameter
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

            // Add the smaller or larger element to the main list
            if (condition) {
                products.set(k, left.get(i));
                i++;
            } else {
                products.set(k, right.get(j));
                j++;
            }
            k++;
        }

        // Add remaining elements from the left list, if any
        while (i < left.size()) {
            products.set(k, left.get(i));
            i++;
            k++;
        }

        // Add remaining elements from the right list, if any
        while (j < right.size()) {
            products.set(k, right.get(j));
            j++;
            k++;
        }
    }

    // Recursive function for Merge Sort
    public static void sort(List<ProductModel> productList, String sortBy, boolean isAscending, JTable productTable) {
        if (productList.size() < 2) {
            return; // Base case: single element is already sorted
        }

        // Split the list into two halves
        int mid = productList.size() / 2;
        List<ProductModel> left = new ArrayList<>(productList.subList(0, mid));
        List<ProductModel> right = new ArrayList<>(productList.subList(mid, productList.size()));

        // Recursively sort both halves
        sort(left, sortBy, isAscending, null);
        sort(right, sortBy, isAscending, null);

        // Merge the sorted halves
        merge(productList, left, right, sortBy, isAscending);

        // Update the table after the final merge
        if (productTable != null) {
            TableUpdator tableUpdator = new TableUpdator();
            tableUpdator.refreshProductTable(productTable, productList);
        }
    }
}
