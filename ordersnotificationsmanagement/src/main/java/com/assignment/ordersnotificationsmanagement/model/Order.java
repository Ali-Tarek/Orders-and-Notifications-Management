package com.assignment.ordersnotificationsmanagement.model;

import java.util.List;


public class Order {
    private int id;
    private int customerId;
    private List<Pair> products;
    private OrderStatus status;
    private OrderType type;


    // Constructors, getters, and setters...

    // Default constructor
    public Order() {
    }

    // Parameterized constructor
    public Order(int id, int customerId, List<Pair> products, OrderStatus status, OrderType type) {
        this.id = id;
        this.customerId = customerId;
        this.products = products;
        this.status = status;
        this.type = type;
    }

    // Getters and setters...

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<Pair> getProducts() {
        return products;
    }

    public void setProducts(List<Pair> products) {
        this.products = products;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public OrderType getType() {
        return type;
    }

    public void setType(OrderType type) {
        this.type = type;
    }

}
