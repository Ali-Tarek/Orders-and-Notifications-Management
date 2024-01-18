package com.assignment.ordersnotificationsmanagement.service;

import com.assignment.ordersnotificationsmanagement.model.*;
import com.assignment.ordersnotificationsmanagement.repository.CustomerRepository;
import com.assignment.ordersnotificationsmanagement.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Service
public class NotificationService {

    NotificationRepository notificationRepository;
    CustomerRepository customerRepository;

    @Autowired
    public NotificationService(NotificationRepository notificationRepository, CustomerRepository customerRepository){
        this.notificationRepository = notificationRepository;
        this.customerRepository = customerRepository;
    }

    public Queue<String> getNotifications() {
        Queue <Notification> notifications = notificationRepository.getNotifications();
        Queue <String> content = new LinkedList<>();
        while(!notifications.isEmpty()){
            content.add(notifications.poll().getContent());
        }
        return content;
    }

    public void addNotification(int customerId, Order order){
        Notification newNotification = new PlacementNotification(customerRepository.getCustomerById(customerId),
                "content",
                NotificationChannel.EMAIL,
                order);
        newNotification.setContent(newNotification.getNotificationMessage());

        notificationRepository.addNotifications(newNotification);

    }

}
