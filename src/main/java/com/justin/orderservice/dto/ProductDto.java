package com.justin.orderservice.dto;

public class ProductDto {

    private Long id;
    private int price;
    private String name;
    private int stock;

    public ProductDto(){}
    public ProductDto(Long id, int price, String name, int stock){
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getStock(){
        return stock;
    }

    public int getPrice(){
        return price;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public void setPrice(int price){
        this.price = price;
    }
}
