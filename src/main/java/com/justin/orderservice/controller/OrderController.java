package com.justin.orderservice.controller;


import com.justin.orderservice.entity.Order;
import com.justin.orderservice.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public  OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping
    public Order createOrder(@RequestBody Order order){
    return orderService.saveOrder(order);
    }

    @PostMapping
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Optional<Order>getOrderById(@PathVariable Long id){
    return orderService.getOrderById(id);
    }

}
