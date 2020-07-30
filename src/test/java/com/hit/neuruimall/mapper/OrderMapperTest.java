package com.hit.neuruimall.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderMapperTest {

    @Autowired
    OrderMapper orderMapper;

    @Test
    void selectByAll() {
        System.out.println(orderMapper.selectByAll());
    }

    @Test
    void selectByAllDynamic() {
        System.out.println(orderMapper.selectByAllDynamic("%a%", 100, null));
    }

    @Test
    void selectByStatus() {
        System.out.println(orderMapper.selectByStatus(1));
    }

    @Test
    void selectIdWithoutDelivery() {
        System.out.println(orderMapper.selectIdWithoutDelivery());
    }
}