package com.dan.practice.demos.myapp;

import com.dan.practice.demos.myapp.business.AnotherServiceImpl;
import com.dan.practice.demos.myapp.business.MyService;
import com.dan.practice.demos.myapp.business.MyServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        MyService service1 = ctx.getBean(MyServiceImpl.class);
        MyService service2 = ctx.getBean(AnotherServiceImpl.class);
    }
}


