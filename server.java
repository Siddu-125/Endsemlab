package com.klef.jfsd.exam.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private static final String FAKE_STORE_API_URL = "https://fakestoreapi.com/products";

    public List<Object> getAllProducts() {
        RestTemplate restTemplate = new RestTemplate();
        Object[] products = restTemplate.getForObject(FAKE_STORE_API_URL, Object[].class);
        return Arrays.asList(products);
    }
}