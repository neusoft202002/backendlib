package com.hit.neuruimall.service;

import com.hit.neuruimall.model.CartModel;

import java.util.List;

public interface ICartService {

    public List<CartModel> getByUserId(Integer userId);

    public void insert(CartModel cartModel);

    public void deleteById(Integer userId, Integer proId);

    public void updateAmount(CartModel cartModel);
}
