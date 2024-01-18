package com.assignment.ordersnotificationsmanagement.model;

import java.util.ArrayList;
import java.util.List;

public class ShipmentNotification extends Notification {

    public ShipmentNotification(){}
    public ShipmentNotification(Customer customer, String content, NotificationChannel channel, Order order) {
        super(customer, content, channel, order);
    }

    @Override
    public String getNotificationMessage() {
        Order order = this.getOrder();
        Customer customer = this.getCustomer();
        List<Pair> products = order.getProducts();
        String productsName = "";
        for(int i = 0; i < products.size(); i++){
            productsName += products.get(i).getFirst() + ' ';
        }

        return String.format("Dear " + customer.getFirstName() + ' ' + customer.getLastName() +
                ", your shipment of the item(s) [" + productsName +  "] is delivered, thanks for using our store :)");
    }
}
