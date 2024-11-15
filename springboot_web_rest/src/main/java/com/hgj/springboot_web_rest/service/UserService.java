package com.hgj.springboot_web_rest.service;

import com.hgj.springboot_web_rest.data.Result;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    private final RestTemplate restTemplate;

    public UserService (RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }

    public String getUser(String userId) {
        Result forObject = restTemplate.getForObject("http://localhost:8088/users/{userId}", Result.class, userId);
        return forObject.toString();
    }
}
