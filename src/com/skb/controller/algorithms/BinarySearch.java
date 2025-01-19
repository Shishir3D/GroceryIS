package com.skb.controller.algorithms;

import com.skb.controller.algorithms.datastructure.CustomQueue;
import com.skb.model.ProductModel;
import com.skb.util.TableUpdator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JTable;

/**
 * Binary Search Algorithm using CustomQueue to store all matching results.
 * 
 * @author Shishir
 */
public class BinarySearch {

    public static void BinarySearch(List<ProductModel> productList, JTable productTable, String searchName) {
        SelectionSort.SelectionSort(productList, "Name", true, productTable);
        int left = 0;
        int right = productList.size() - 1;

        // Initialize the CustomQueue with a capacity equal to the product list size (upper bound).
        CustomQueue resultQueue = new CustomQueue(productList.size());

        // Perform binary search to find one occurrence of the searchName
        while (left <= right) {
            int mid = left + (right - left) / 2;
            String midName = productList.get(mid).getProductName();

            if (midName.equalsIgnoreCase(searchName)) {
                // Add the found product to the queue
                resultQueue.enQueue(productList.get(mid));

                // Check for duplicates on both sides of the mid index
                addMatchingNeighbors(productList, mid, searchName, resultQueue);
                break;
            }

            if (midName.compareToIgnoreCase(searchName) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        TableUpdator updater = new TableUpdator();

        if (searchName.trim().isEmpty()) {
            System.out.println("Display all products in the table");
            updater.refreshProductTable(productTable, productList);
        } else {
            // Convert CustomQueue to a List to refresh the table
            List<ProductModel> resultList = new LinkedList<>();
            while (!resultQueue.isEmpty()) {
                resultList.add(resultQueue.deQueue());
            }
            updater.refreshProductTable(productTable, resultList);
        }
    }

    /**
     * Checks for neighbors of the given mid index that match the search name and
     * adds them to the queue.
     *
     * @param productList The sorted list of products.
     * @param mid The mid index where a match was found.
     * @param searchName The name being searched for.
     * @param resultQueue The queue to store matching results.
     */
    private static void addMatchingNeighbors(List<ProductModel> productList, int mid, String searchName, CustomQueue resultQueue) {
        // Check to the left of the mid index
        int left = mid - 1;
        while (left >= 0 && productList.get(left).getProductName().equalsIgnoreCase(searchName)) {
            resultQueue.enQueue(productList.get(left));
            left--;
        }

        // Check to the right of the mid index
        int right = mid + 1;
        while (right < productList.size() && productList.get(right).getProductName().equalsIgnoreCase(searchName)) {
            resultQueue.enQueue(productList.get(right));
            right++;
        }
    }
}
