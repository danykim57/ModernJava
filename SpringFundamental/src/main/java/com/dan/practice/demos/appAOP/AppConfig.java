package com.dan.practice.demos.appAOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.dan.practice.demos.appAOP")
@EnableAspectJAutoProxy
public class AppConfig {
}
