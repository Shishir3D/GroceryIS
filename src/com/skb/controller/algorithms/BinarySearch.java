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
public class BinarySearch {

    public static void BinarySearch(List<ProductModel> productList, JTable productTable, String searchName) {
        int left = 0;
        int right = productList.size() - 1;
        ProductModel foundProduct = null;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            String midName = productList.get(mid).getProductName();

            if (midName.equalsIgnoreCase(searchName)) {
                foundProduct = productList.get(mid);
                break;
            }

            if (midName.compareToIgnoreCase(searchName) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        List<ProductModel> result = new ArrayList<>();
        if (foundProduct != null) {
            result.add(foundProduct);
        }

        TableUpdator updater = new TableUpdator();

        if (searchName.trim().equals("")) {
            System.out.println("Display all in the table");
            updater.refreshProductTable(productTable, productList);
        } else {
            updater.refreshProductTable(productTable, result);
        }
    }
}
