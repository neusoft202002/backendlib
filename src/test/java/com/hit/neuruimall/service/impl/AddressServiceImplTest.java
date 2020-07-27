package com.hit.neuruimall.service.impl;

import com.hit.neuruimall.service.IAddressService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AddressServiceImplTest {

    @Autowired
    IAddressService addressService;

    @Test
    void insert() {
    }

    @Test
    void getById() {
        System.out.println(addressService.getById(1, 1));
    }

    @Test
    void deleteById() {
    }

    @Test
    void update() {
    }

    @Test
    void getUserAddressId() {
    }
}