package com.assignment.ordersnotificationsmanagement.model;

import jakarta.persistence.*;

public class Notification {
    private Customer customer;
    private String content;
    private NotificationChannel channel;
    private Order order;
    // Constructors, getters, and setters...

    // Default constructor
    public Notification() {
    }

    // Parameterized constructor
    public Notification(Customer customer, String content, NotificationChannel channel, Order order) {
        this.customer = customer;
        this.content = content;
        this.channel = channel;
        this.order = order;
    }

    // Getters and setters...

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public NotificationChannel getChannel() {
        return channel;
    }

    public void setChannel(NotificationChannel channel) {
        this.channel = channel;
    }

    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }

    public String getNotificationMessage(){
        return null;
    }
}
