package com.pluralsight;
// Made a shopping cart so user can keep track of running total and add or removing items from cart
public class shoppingCart {
    private String sKU;
    private String productName;
    private double price;
    private String Department;

    public shoppingCart(String sKU, String productName, double price, String department) {
        this.sKU = sKU;
        this.productName = productName;
        this.price = price;
        Department = department;
    }

    public String getsKU() {
        return sKU;
    }

    public void setsKU(String sKU) {
        this.sKU = sKU;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
