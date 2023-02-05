package com.zaychin.service;

import com.zaychin.entity.Order;
import com.zaychin.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record OrderService(OrderRepository orderRepository) {

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(int orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }

    public void deleteOrder(int orderId) {
        orderRepository.deleteById(orderId);
    }
}
