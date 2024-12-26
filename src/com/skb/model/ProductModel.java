/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.skb.model;

/**
 *
 * @author shishir
 */
public class ProductModel {

    private int productId;
    private String productName;
    private String weight;
    private String weightUnit;
    private String supplier;
    private double price; 
    private int quantity;


    public ProductModel(int productId, String productName, String weight, String weightUnit, String supplier, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.weight = weight;
        this.weightUnit = weightUnit;
        this.supplier = supplier;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters for each field
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getQuantity() {
        return quantity;
    }

    public void setPrice(int quantity) {
        this.quantity = quantity;
    }
}
