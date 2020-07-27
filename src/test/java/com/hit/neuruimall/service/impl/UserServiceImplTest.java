package com.hit.neuruimall.service.impl;

import com.hit.neuruimall.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private IUserService userService;

    @Test
    void getByAll() {
    }

    @Test
    void getByAllWithAddress() {
        System.out.println(userService.getByAllWithAddress());
    }

    @Test
    void getById() {
    }

    @Test
    void insert() {
    }

    @Test
    void update() {
    }

    @Test
    void deleteById() {
    }
}