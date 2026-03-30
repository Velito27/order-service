package com.justin.orderservice.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long productId;

    private Long userId;

    private Long quantity;

    public Order(){
    }

    public Order (Long id, Long productId, Long userId, Long quantity){
        this.id = id;
        this.productId = productId;
        this.userId = userId;
        this.quantity = quantity;
    }

    public Long getId(){
        return id;
    }
    public Long getProductId(){
        return productId;
    }
    public Long getUserId(){
        return userId;
    }
    public Long getQuantity(){
        return quantity;
    }

    public void setId(Long id){
        this.id = id;
    }
    public void setProductId(Long productId){
        this.productId = productId;
    }
    public void setUserId(Long userId){
        this.userId = userId;
    }
    public void setQuantity(Long quantity){
        this.quantity = quantity;
    }

}

