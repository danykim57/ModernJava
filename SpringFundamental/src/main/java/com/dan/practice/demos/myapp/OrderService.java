package com.dan.practice.demos.myapp;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {
    @Transactional
    public void placeOrder() {
        //This places an order
        System.out.println("Placing Order...");
    }
}
