package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FooServiceTest {
    @Autowired private FooService service;

    @BeforeAll
    static void initAll() {}

    @BeforeEach
    void init() {}

    @Test
    void testBar() {
        assertEquals("foobar", service.bar());
    }

    @AfterEach
    void tearDown() {}

    @AfterAll
    static void tearDownAll() {}
}
