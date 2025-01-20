package com.skb.model;

/**
 * Represents a product with details such as ID, name, weight, supplier, price, and quantity.
 * Provides getter and setter methods to access and modify the product attributes.
 * 
 * @author 23048645 Shishir Poudel
 */
public class ProductModel {

    private int productId;
    private String productName;
    private String weight;
    private String weightUnit;
    private String supplier;
    private double price; 
    private int quantity;

    /**
     * Constructs a ProductModel with the specified details.
     * 
     * @param productId    The unique identifier of the product.
     * @param productName  The name of the product.
     * @param weight       The weight of the product.
     * @param weightUnit   The unit of measurement for the weight.
     * @param supplier     The supplier of the product.
     * @param price        The price of the product.
     * @param quantity     The available quantity of the product.
     */
    public ProductModel(int productId, String productName, String weight, String weightUnit, String supplier, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.weight = weight;
        this.weightUnit = weightUnit;
        this.supplier = supplier;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Retrieves the unique identifier of the product.
     * 
     * @return The product ID.
     */
    public int getProductId() {
        return productId;
    }

    /**
     * Updates the unique identifier of the product.
     * 
     * @param productId The new product ID to set.
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * Retrieves the name of the product.
     * 
     * @return The product name.
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Updates the name of the product.
     * 
     * @param productName The new product name to set.
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Retrieves the weight of the product.
     * 
     * @return The product weight.
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Updates the weight of the product.
     * 
     * @param weight The new product weight to set.
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * Retrieves the unit of measurement for the product weight.
     * 
     * @return The weight unit.
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * Updates the unit of measurement for the product weight.
     * 
     * @param weightUnit The new weight unit to set.
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    /**
     * Retrieves the supplier of the product.
     * 
     * @return The supplier name.
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * Updates the supplier of the product.
     * 
     * @param supplier The new supplier name to set.
     */
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    /**
     * Retrieves the price of the product.
     * 
     * @return The product price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Updates the price of the product.
     * 
     * @param price The new product price to set.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Retrieves the available quantity of the product.
     * 
     * @return The product quantity.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Updates the available quantity of the product.
     * 
     * @param quantity The new product quantity to set.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
