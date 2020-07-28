package com.hit.neuruimall.controller;

import com.hit.neuruimall.model.CartModel;
import com.hit.neuruimall.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    private ICartService cartService;

    @GetMapping("/getUserCartById")
    public List<CartModel> getUserCartById(Integer userId) {
        System.out.println(userId);
        return cartService.getByUserId(userId);
    }

    @PostMapping("/insertCart")
    public boolean insert(CartModel cartModel) {
        cartService.insert(cartModel);
        return true;
    }

    @GetMapping("/deleteCart")
    public List<CartModel> deleteById(Integer userId, Integer proId) {
        cartService.deleteById(userId, proId);
        return cartService.getByUserId(userId);
    }

    @PostMapping("/updateAmount")
    public boolean updateAmount(CartModel cartModel) {
        cartService.updateAmount(cartModel);
        return true;
    }
}
