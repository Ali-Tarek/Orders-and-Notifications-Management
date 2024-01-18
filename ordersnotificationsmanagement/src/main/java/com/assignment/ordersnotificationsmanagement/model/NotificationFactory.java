package com.assignment.ordersnotificationsmanagement.model;

import com.assignment.ordersnotificationsmanagement.Database.INMemoryDB;

public class NotificationFactory {

    public Notification createNotification(String type, Order order) {
        if(type == "PLACEMENT"){
            return new PlacementNotification();
        }
        else if(type == "SHIPMENT"){
            return new ShipmentNotification();
        }
        else{
            return null;
        }
    }
}
