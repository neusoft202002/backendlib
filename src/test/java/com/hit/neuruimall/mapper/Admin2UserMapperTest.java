package com.hit.neuruimall.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Admin2UserMapperTest {

    @Autowired
    Admin2UserMapper admin2UserMapper;

    @Test
    void selectAdmin2UserId() {
        System.out.println(admin2UserMapper.selectAdmin2UserId("wuhao"));
    }
}