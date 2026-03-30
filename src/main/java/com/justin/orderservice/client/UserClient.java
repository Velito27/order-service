package com.justin.orderservice.client;

import com.justin.orderservice.dto.UserDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserClient {
    private final RestTemplate restTemplate;

    public UserClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public UserDto getUserById(Long userId) {
        String url = "http://localhost:8081/users/" + userId;

        try {
            return restTemplate.getForObject(url, UserDto.class);
        } catch (Exception e) {
            return null;
        }
    }
}
