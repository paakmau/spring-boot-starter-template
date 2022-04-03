package com.example.demo.config;

import com.example.demo.service.FooService;
import com.example.demo.service.FooServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoAutoConfiguration {
    @Bean
    public FooService fooService() {
        return new FooServiceImpl();
    }
}
