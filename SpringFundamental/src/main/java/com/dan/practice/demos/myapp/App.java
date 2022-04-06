package com.dan.practice.demos.myapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext("com.dan.practice.demos.myapp");
        ctx.start();
        ctx.close();
    }
}