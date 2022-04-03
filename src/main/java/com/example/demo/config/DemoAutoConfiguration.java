package com.example.demo.config;

import com.example.demo.service.FooService;
import com.example.demo.service.FooServiceImpl;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "demo")
public class DemoAutoConfiguration {
    private String bar = "bar";

    public void setBar(String bar) {
        this.bar = bar;
    }

    @Bean
    public FooService fooService() {
        return new FooServiceImpl(bar);
    }
}
