package com.dan.practice.demos.myapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.dan.practice.demos.myapp")
@PropertySource("classpath:application.properties")
public class AppConfig {
}
