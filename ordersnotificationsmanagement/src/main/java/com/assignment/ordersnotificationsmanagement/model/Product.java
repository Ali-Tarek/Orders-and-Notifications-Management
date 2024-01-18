package com.assignment.ordersnotificationsmanagement.model;
import jakarta.persistence.*;

public class Product {
    private int id;
    private String serialNumber;
    private String name;
    private String vendor;
    private String category;
    private double price;
    private int remainingParts;

    // Constructor
    public Product(int id, String serialNumber, String name, String vendor, String category, double price, int remainingParts) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.name = name;
        this.vendor = vendor;
        this.category = category;
        this.price = price;
        this.remainingParts = remainingParts;
    }

    public Product() {

    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRemainingParts() {
        return remainingParts;
    }

    public void setRemainingParts(int remainingParts) {
        this.remainingParts = remainingParts;
    }
}
