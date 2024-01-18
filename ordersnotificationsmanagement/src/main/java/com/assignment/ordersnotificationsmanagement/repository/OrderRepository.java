package com.assignment.ordersnotificationsmanagement.repository;
import com.assignment.ordersnotificationsmanagement.Database.INMemoryDB;
import com.assignment.ordersnotificationsmanagement.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepository {

    INMemoryDB dataBase;
    int nextId;
    public OrderRepository(INMemoryDB dataBase){
        this.dataBase = dataBase;
        this.nextId = 0;
    }

    public List<Order> getAllOrders(){
        return this.dataBase.getOrders();
    }

    public void createOrder(Order newOrder){
        this.dataBase.addOrder(newOrder);

    }

    public void updateBalance(int id, double price){
        this.dataBase.updateBalance(id, price);
    }

    public int getNextId() {
        return nextId++;
    }

    public void cancelOrder(int id) {
        List<Order> orders = getAllOrders();
        for(int i = 0; i < orders.size(); i++){
            if(orders.get(i).getId() == id){
                this.dataBase.getOrders().remove(orders.get(i));
                return;
            }
        }

    }
}