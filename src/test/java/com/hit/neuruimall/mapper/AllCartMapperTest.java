package com.hit.neuruimall.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AllCartMapperTest {

    @Autowired
    AllCartMapper allCartMapper;

    @Test
    void selectByAll() {
        System.out.println(allCartMapper.selectByAll());
    }
}