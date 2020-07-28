package com.hit.neuruimall.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductMapperTest {

    @Autowired
    ProductMapper productMapper;

    @Test
    void selectByAll() {
        System.out.println(productMapper.selectByAll());
    }

    @Test
    void selectByAllWithStocks(){
        System.out.println(productMapper.selectByAllWithStocks());
    }

    @Test
    void deleteById() {
        productMapper.deleteById(2);
    }

    @Test
    void selectAllId() {
        System.out.println(productMapper.selectAllId());
    }

    @Test
    void selectById() {
        System.out.println(productMapper.selectById(1));
    }
}