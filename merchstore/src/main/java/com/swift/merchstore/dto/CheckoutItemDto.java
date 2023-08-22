package com.swift.merchstore.dto;

public class CheckoutItemDto {

    private String productName;
    private int  quantity;
    private int price;
    private long productId;

    public CheckoutItemDto() {}

    public CheckoutItemDto(String productName, int quantity, int price, long productId) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice(){return price;}

    public long getProductId() {
        return productId;
    }

    public void setProductId(long id) {
        this.productId = id;
    }
}
