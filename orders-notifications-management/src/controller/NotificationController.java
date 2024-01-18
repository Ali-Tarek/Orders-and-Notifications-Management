//package com.assignment.ordersnotificationsmanagement.controller;
//
//import com.assignment.ordersnotificationsmanagement.model.Notification;
//import com.assignment.ordersnotificationsmanagement.service.NotificationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//@RestController
//@RequestMapping("/api/notifications")
//public class NotificationController {
//    private final NotificationService notificationService;
//
//    @Autowired
//    public NotificationController(NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Notification>> getAllNotifications() {
//        List<Notification> notifications = notificationService.getAllNotifications();
//        return ResponseEntity.ok(notifications);
//    }
//
//    @GetMapping("/{notificationId}")
//    public ResponseEntity<Notification> getNotificationById(@PathVariable Long notificationId) {
//        return notificationService.getNotificationById(notificationId)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @PostMapping
//    public ResponseEntity<Notification> createNotification(@RequestBody Notification notification) {
//        Notification createdNotification = notificationService.saveNotification(notification);
//        return ResponseEntity.ok(createdNotification);
//    }
//
//    @PutMapping("/{notificationId}")
//    public ResponseEntity<Notification> updateNotification(@PathVariable Long notificationId, @RequestBody Notification notification) {
//        notification.setId(notificationId);
//        Notification updatedNotification = notificationService.saveNotification(notification);
//        return ResponseEntity.ok(updatedNotification);
//    }
//
//    @DeleteMapping("/{notificationId}")
//    public ResponseEntity<Void> deleteNotification(@PathVariable Long notificationId) {
//        notificationService.deleteNotification(notificationId);
//        return ResponseEntity.noContent().build();
//    }
//}
