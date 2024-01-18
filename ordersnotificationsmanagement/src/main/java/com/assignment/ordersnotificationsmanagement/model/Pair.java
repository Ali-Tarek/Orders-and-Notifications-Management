package com.assignment.ordersnotificationsmanagement.model;

public class Pair {

    private final String productName;
    private final Integer quantity;

    public Pair(String productName, Integer quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getFirst() {
        return productName;
    }

    public Integer getSecond() {
        return quantity;
    }
}
