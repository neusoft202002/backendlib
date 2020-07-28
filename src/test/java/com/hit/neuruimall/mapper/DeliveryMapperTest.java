package com.hit.neuruimall.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DeliveryMapperTest {

    @Autowired
    private DeliveryMapper deliveryMapper;

    @Test
    void selectAllDelivery() {
        System.out.println(deliveryMapper.selectAllDelivery());
    }

    @Test
    void deleteById() {
    }

    @Test
    void insert() {
    }

    @Test
    void updateStatus() {
        deliveryMapper.updateStatus(5, 1);
    }
}