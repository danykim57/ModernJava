package com.dan.practice.demos.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        repository.loadData();
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("Destryoing the EmployeeService bean...");
    }
}
