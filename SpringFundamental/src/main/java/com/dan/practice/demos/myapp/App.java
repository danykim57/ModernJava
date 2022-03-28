package com.dan.practice.demos.myapp;

import org.springframework.aop.framework.ProxyFactoryBean;

public class App {
    public static void main(String[] args) throws InterruptedException {
        IPerson p= new Person();

        ProxyFactoryBean proxyFactory = new ProxyFactoryBean();
        proxyFactory.setTarget(p);
        Object proxy = proxyFactory.getObject();

        IPerson bean = (IPerson) proxy;
        bean.greet();
    }
}


