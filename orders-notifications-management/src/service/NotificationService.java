//package com.assignment.ordersnotificationsmanagement.service;
//
//import com.assignment.ordersnotificationsmanagement.model.Notification;
//import com.assignment.ordersnotificationsmanagement.repository.NotificationRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class NotificationService {
//    private final NotificationRepository notificationRepository;
//
//    @Autowired
//    public NotificationService(NotificationRepository notificationRepository) {
//        this.notificationRepository = notificationRepository;
//    }
//
//    public List<Notification> getAllNotifications() {
//        return notificationRepository.findAll();
//    }
//
//    public Optional<Notification> getNotificationById(Long notificationId) {
//        return notificationRepository.findById(notificationId);
//    }
//
//    public Notification saveNotification(Notification notification) {
//        return notificationRepository.save(notification);
//    }
//
//    public void deleteNotification(Long notificationId) {
//        notificationRepository.deleteById(notificationId);
//    }
//}