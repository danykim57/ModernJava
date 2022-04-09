package com.dan.practice.demos.appAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService service = ctx.getBean(MyService.class);
        service.doSomething(9);
        service.doAnother();
    }
}
