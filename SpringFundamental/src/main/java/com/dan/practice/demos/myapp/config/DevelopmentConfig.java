package com.dan.practice.demos.myapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("local")
@Configuration
@ComponentScan("com.dan.practice.demos.myapp")
@PropertySource("classpath:application-local.properties")
public class DevelopmentConfig {
}
