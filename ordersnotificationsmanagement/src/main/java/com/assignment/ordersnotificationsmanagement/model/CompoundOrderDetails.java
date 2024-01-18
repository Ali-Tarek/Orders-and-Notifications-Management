package com.assignment.ordersnotificationsmanagement.model;

import java.util.ArrayList;
import java.util.List;

public class CompoundOrderDetails {
    List<SimpleOrderDetails> compoundOrders;

    public CompoundOrderDetails() {
        this.compoundOrders = new ArrayList<>();
    }

    public List<SimpleOrderDetails> getCompoundOrders(){
        return compoundOrders;
    }
}
