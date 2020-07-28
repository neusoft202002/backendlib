package com.hit.neuruimall.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderItemMapperTest {

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Test
    void selectAllOrderId() {
        System.out.println(orderItemMapper.selectAllOrderId());
    }

    @Test
    void selectById() {
        System.out.println(orderItemMapper.selectById(1));
    }
}