package com.codegym.model;

public class product {
    private int id;
    private String productName;
    private double weight;
    private String color;

    public product() {
    }

    public product(int id, String productName, double weight, String color) {
        this.id = id;
        this.productName = productName;
        this.weight = weight;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
