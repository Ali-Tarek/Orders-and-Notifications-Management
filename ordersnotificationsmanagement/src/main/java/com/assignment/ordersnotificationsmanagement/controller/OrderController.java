package com.assignment.ordersnotificationsmanagement.controller;

import com.assignment.ordersnotificationsmanagement.model.CompoundOrderDetails;
import com.assignment.ordersnotificationsmanagement.model.Order;
import com.assignment.ordersnotificationsmanagement.model.SimpleOrderDetails;
import com.assignment.ordersnotificationsmanagement.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping("")
    public ResponseEntity<List<Order>> getAllOrders(){
        return ResponseEntity.ok(orderService.getAllOrders());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOrderById(@PathVariable("id") int id) {
        Order order = orderService.getOrderById(id);
        if (order == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Order with ID " + id + " not found.");
        } else {
            return ResponseEntity.ok(order);
        }
    }
    @PostMapping("/place/simple")
    public ResponseEntity<String> PlaceSimpleOrder(@RequestBody SimpleOrderDetails simpleOrderDetails){
        int orderId = orderService.placeSimpleOrder(simpleOrderDetails);
        return ResponseEntity.ok("Order placed successfully with id " + orderId);
    }

    @PostMapping("/place/compound")
    public ResponseEntity<String> PlaceCompoundOrder(@RequestBody CompoundOrderDetails compoundOrderDetails){
        int orderId = orderService.PlaceCompoundOrder(compoundOrderDetails);
        return ResponseEntity.ok("Order placed successfully with id " + orderId);
    }


    @DeleteMapping("/cancel/{id}")
    public ResponseEntity<String> removeOrder(@PathVariable int id){
        if(orderService.cancelOrder(id)){
            return new ResponseEntity<>("Order cancelled successfully", HttpStatus.OK);
        }
        return new ResponseEntity<>("Order can't be cancelled", HttpStatus.BAD_REQUEST);
    }

}