package com.dan.practice.demos.myapp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements ApplicationContextAware {

    EmployeeRepository repository;

    @Autowired
    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //To use Bean we can do this
        //applicationContext.getBean();
        System.out.println("Here is the app context: " + applicationContext);
    }

}
