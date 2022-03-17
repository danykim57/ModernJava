package com.dan.practice.demos.myapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope(value = "prototype")
    public MyService getService() {
        return new MyService(getRepository());
    }

    @Bean
    public MyRepository getRepository() {
        return new MyRepository();
    }
}
