package com.justin.orderservice.client;

import com.justin.orderservice.dto.ProductDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductClient {

    private final RestTemplate restTemplate;

    public ProductClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ProductDto getProductById(Long productId) {
        String url = "http://localhost:8082/products/" + productId;

        try {
            return restTemplate.getForObject(url, ProductDto.class);
        } catch (Exception e) {
            return null;
        }
    }
}