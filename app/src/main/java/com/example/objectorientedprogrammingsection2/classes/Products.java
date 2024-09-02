package com.example.objectorientedprogrammingsection2.classes;

public class Products {
    private String productName;
    private int productStock;

    // 1- Empty Constructor
    // 2- Constructor with Parameters
    // 3- Set & Get Methods


    public Products() { // command N or top menu>Code>Generate>Constructor>Select None
    }

    public Products(String productName, int productStock) { // command N or top menu>Code>Generate>Constructor>Select All
        this.productName = productName;
        this.productStock = productStock;
    }


    public String getProductName() { // command N or top menu>Code>Generate>Getter And Setter>Select All
        return productName;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }
}
