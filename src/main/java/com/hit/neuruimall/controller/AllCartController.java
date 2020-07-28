package com.hit.neuruimall.controller;

import com.hit.neuruimall.model.AllCartModel;
import com.hit.neuruimall.service.IAllCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AllCartController {

    @Autowired
    IAllCartService allCartService;

    @GetMapping("/getAllCart")
    public List<AllCartModel> getAllCart() {
        return allCartService.getAllCart();
    }
}
