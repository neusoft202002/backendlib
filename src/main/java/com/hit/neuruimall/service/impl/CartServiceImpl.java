package com.hit.neuruimall.service.impl;

import com.hit.neuruimall.mapper.CartMapper;
import com.hit.neuruimall.model.CartModel;
import com.hit.neuruimall.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements ICartService {

    @Autowired
    private CartMapper cartMapper;

    @Override
    public List<CartModel> getByUserId(Integer userId) {
        return cartMapper.selectByUserId(userId);
    }

    @Override
    public void insert(CartModel cartModel) {
        cartMapper.insert(cartModel);
    }

    @Override
    public void deleteById(Integer userId, Integer proId) {
        cartMapper.deleteById(userId, proId);
    }

    @Override
    public void updateAmount(CartModel cartModel) {
        cartMapper.updateAmount(cartModel);
    }
}
