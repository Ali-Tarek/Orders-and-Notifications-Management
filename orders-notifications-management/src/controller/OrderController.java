//package com.assignment.ordersnotificationsmanagement.controller;
//
//import com.assignment.ordersnotificationsmanagement.model.Order;
//import com.assignment.ordersnotificationsmanagement.model.OrderItem;  // Import OrderItem
//import com.assignment.ordersnotificationsmanagement.service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/orders")
//public class OrderController {
//    private final OrderService orderService;
//
//    @Autowired
//    public OrderController(OrderService orderService) {
//        this.orderService = orderService;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Order>> getAllOrders() {
//        List<Order> orders = orderService.getAllOrders();
//        return ResponseEntity.ok(orders);
//    }
//
//    @GetMapping("/{orderId}")
//    public ResponseEntity<Order> getOrderById(@PathVariable Long orderId) {
//        return orderService.getOrderById(orderId)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @PostMapping
//    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
//        Order createdOrder = orderService.saveOrder(order);
//        return ResponseEntity.ok(createdOrder);
//    }
//
//    @PutMapping("/{orderId}")
//    public ResponseEntity<Order> updateOrder(@PathVariable Long orderId, @RequestBody Order order) {
//        order.setId(orderId);
//        Order updatedOrder = orderService.saveOrder(order);
//        return ResponseEntity.ok(updatedOrder);
//    }
//
//    @DeleteMapping("/{orderId}")
//    public ResponseEntity<Void> deleteOrder(@PathVariable Long orderId) {
//        orderService.deleteOrder(orderId);
//        return ResponseEntity.noContent().build();
//    }
//}
