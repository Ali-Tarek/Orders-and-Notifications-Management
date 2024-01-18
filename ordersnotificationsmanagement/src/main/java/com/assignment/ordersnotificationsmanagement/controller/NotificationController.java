package com.assignment.ordersnotificationsmanagement.controller;

import com.assignment.ordersnotificationsmanagement.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Queue;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {
    NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    @GetMapping("")
    public Queue<String> getNotification(){
        return notificationService.getNotifications();
    }
}
