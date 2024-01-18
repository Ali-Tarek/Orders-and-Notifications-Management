package com.assignment.ordersnotificationsmanagement.Database;

import com.assignment.ordersnotificationsmanagement.model.*;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Repository
public class INMemoryDB {
    List<Product> products;
    List <Customer> customers;
    List <Order> orders;
    Queue <Notification> notifications;

    public INMemoryDB(){
        this.products = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.notifications = new LinkedList<>();
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public List<Product> getProducts() {
        return this.products;
    }
    public List<Customer> getCustomers() {
        return this.customers;
    }
    public void addCustomer(Customer newCustomer) {
        customers.add(newCustomer);
    }
    public List<Order> getOrders() {
        return this.orders;
    }
    public void addOrder(Order newOrder) {
        orders.add(newOrder);
    }

    public void updateBalance(int id, double price) {
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getId() == id){
                customers.get(i).setBalance(customers.get(i).getBalance() - price);
                return;
            }
        }
    }

    public Queue<Notification> getNotifications() {
        return notifications;
    }

    public void addNotification(Notification notification) {
        notifications.add(notification);
    }
}
