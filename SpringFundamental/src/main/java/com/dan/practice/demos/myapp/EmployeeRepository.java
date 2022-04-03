package com.dan.practice.demos.myapp;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    public void loadData() {
        System.out.println("Loading data...");
    }
}
