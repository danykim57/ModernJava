package com.dan.practice.demos.appAOP;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void doSomething(int num) {
        System.out.println("Doing something...Number is " + num);
    }

    public void doAnother() {
        System.out.println("Doing the another thing...");
    }
}
