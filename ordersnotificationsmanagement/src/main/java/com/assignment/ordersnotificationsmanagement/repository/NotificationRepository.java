package com.assignment.ordersnotificationsmanagement.repository;

import com.assignment.ordersnotificationsmanagement.Database.INMemoryDB;
import com.assignment.ordersnotificationsmanagement.model.Customer;
import com.assignment.ordersnotificationsmanagement.model.Notification;
import com.assignment.ordersnotificationsmanagement.model.NotificationChannel;
import org.aspectj.weaver.ast.Not;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Queue;

@Repository
public class NotificationRepository {
    INMemoryDB dataBase;
    public NotificationRepository(INMemoryDB dataBase){
        this.dataBase = dataBase;
    }
    public Queue<Notification> getNotifications(){
        return this.dataBase.getNotifications();
    }
    public void addNotifications(Notification notification){
        this.dataBase.addNotification(notification);
    }
}
