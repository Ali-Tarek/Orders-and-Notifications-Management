package com.assignment.ordersnotificationsmanagement.service;
import com.assignment.ordersnotificationsmanagement.model.*;
import com.assignment.ordersnotificationsmanagement.repository.OrderRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class OrderService {

    private OrderRepository orderRepository;
    NotificationService notificationService;
    public OrderService(OrderRepository orderRepository, NotificationService notificationService){
        this.orderRepository = orderRepository;
        this.notificationService = notificationService;
    }
    public List<Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    public Order getOrderById(int id) {
        List <Order> orders = orderRepository.getAllOrders();
        for(int i = 0; i < orders.size(); i++)
            if(Objects.equals(orders.get(i).getId(), id))
                return orders.get(i);
        return null;
    }

    public int placeSimpleOrder(SimpleOrderDetails simpleOrderDetails) {



        Order newOrder = new Order(
                orderRepository.getNextId(),
                simpleOrderDetails.getCustomerId(),
                simpleOrderDetails.getProductQuantities(),
                OrderStatus.PENDING,
                OrderType.SIMPLE);
        
        orderRepository.updateBalance(simpleOrderDetails.getCustomerId(), simpleOrderDetails.getPrice() + simpleOrderDetails.getFee());

        this.orderRepository.createOrder(newOrder);

        notificationService.addNotification(simpleOrderDetails.getCustomerId(), newOrder);

        return newOrder.getId();
    }

    public int PlaceCompoundOrder(CompoundOrderDetails compoundOrderDetails) {

        List<SimpleOrderDetails> orders = compoundOrderDetails.getCompoundOrders();
        SimpleOrderDetails finalOrder = new SimpleOrderDetails();
        finalOrder.setCustomerId(orders.get(0).getCustomerId());
        for(int i = 0; i < orders.size(); i++){
            for(int j = 0; j < orders.get(i).size(); j++){
                finalOrder.addProductQuantity(orders.get(i).get(i));
            }
            orderRepository.updateBalance(orders.get(i).getCustomerId(), orders.get(i).getPrice() + orders.get(i).getFee() / 1.0 * orders.size());
        }

        Order newOrder = new Order(
                orderRepository.getNextId(),
                finalOrder.getCustomerId(),
                finalOrder.getProductQuantities(),
                OrderStatus.PENDING,
                OrderType.COMPOUND);

        orderRepository.createOrder(newOrder);

        notificationService.addNotification(finalOrder.getCustomerId(), newOrder);

        return newOrder.getId();

    }


    public boolean cancelOrder(int id) {

        List<Order> orders = orderRepository.getAllOrders();
        for(int i = 0; i < orders.size(); i++){
            if(orders.get(i).getId() == id){
                orderRepository.cancelOrder(id);
                return true;
            }
        }
        return false;
    }

}
