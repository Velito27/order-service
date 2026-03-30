package com.justin.orderservice.service;


import com.justin.orderservice.client.ProductClient;
import com.justin.orderservice.client.UserClient;
import com.justin.orderservice.dto.ProductDto;
import com.justin.orderservice.dto.UserDto;
import com.justin.orderservice.entity.Order;
import com.justin.orderservice.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final UserClient userClient;
    private final ProductClient productClient;

    public OrderService(OrderRepository orderRepository, UserClient userClient, ProductClient productClient){
        this.orderRepository = orderRepository;
        this.productClient = productClient;
        this.userClient = userClient;
    }

    public Order createOrder(Order order) {

        UserDto user = userClient.getUserById(order.getUserId());
        if (user == null) {
            throw new RuntimeException("Usuario no existe");
        }

        ProductDto product = productClient.getProductById(order.getProductId());
        if (product == null) {
            throw new RuntimeException("Producto no existe");
        }

        if (product.getStock() < order.getQuantity()) {
            throw new RuntimeException("Stock insuficiente");
        }

        return orderRepository.save(order);


    }
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }


}




