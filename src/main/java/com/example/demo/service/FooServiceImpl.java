package com.example.demo.service;

public class FooServiceImpl implements FooService {
    final String bar;

    public FooServiceImpl(String bar) {
        this.bar = bar;
    }

    @Override
    public String bar() {
        return bar;
    }
}
