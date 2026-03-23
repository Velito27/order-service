package com.justin.orderservice.entity;


import jakarta.persistence.*;
import org.aspectj.weaver.ast.Or;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long productsId;

    private Long userId;

    private Long quantity;

    public Order(){
    }

    public Order (Long id, Long productsId, Long userId, Long quantity){
        this.id = id;
        this.productsId = productsId;
        this.userId = userId;
        this.quantity = quantity;
    }

    public Long getId(){
        return id;
    }
    public Long getProductsId(){
        return productsId;
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
    public void setProductsId(Long productsId){
        this.productsId = productsId;
    }
    public void setUserId(Long userId){
        this.userId = userId;
    }
    public void setQuantity(Long quantity){
        this.quantity = quantity;
    }

}

