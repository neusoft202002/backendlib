package com.hit.neuruimall.mapper;

import com.hit.neuruimall.model.CartModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CartMapperTest {

    @Autowired
    CartMapper cartMapper;

    @Test
    void selectByUserId() {
        System.out.println(cartMapper.selectByUserId(1));
    }

    @Test
    void insert() {
        CartModel cartModel = new CartModel();
        cartModel.setUserId(3);
        cartModel.setProId(4);
        cartModel.setAmount(10);
        cartMapper.insert(cartModel);
    }

    @Test
    void deleteById() {
    }

    @Test
    void updateAmount() {
    }
}