package com.assignment.ordersnotificationsmanagement.model;

import java.util.*;

public class SimpleOrderDetails {

    private int customerId;
    private List<Pair> productQuantities;

    public SimpleOrderDetails() {
        this.customerId = -1;
        this.productQuantities = new ArrayList<>();
    }

    public int getCustomerId(){
        return customerId;
    }
    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }

    public List<Pair> getProductQuantities() {
        return productQuantities;
    }
    public double getPrice(){
        double price = 0;
        for(int i = 0; i < productQuantities.size(); i++){
            price += 10.0 * productQuantities.get(i).getSecond();
        }
        return price;
    }
    public void addProductQuantity(Pair newProductQuantities){
        this.productQuantities.add(newProductQuantities);
    }

    public int size() {
        return productQuantities.size();
    }

    public Pair get(int i) {
        return productQuantities.get(i);
    }

    public double getFee() {
        return 15;
    }
}
