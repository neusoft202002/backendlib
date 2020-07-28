package com.hit.neuruimall.service.impl;

import com.hit.neuruimall.service.IOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderServiceImplTest {

    @Autowired
    IOrderService orderService;

    @Test
    void insert() {
        orderService.insert(1, "4 5 6", "1 2 3");
    }
}