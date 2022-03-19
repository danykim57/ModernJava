package com.dan.practice.demos.myapp;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public void doQuery() {
        System.out.println("Doing DB query!");
    }
}
