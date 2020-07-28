package com.hit.neuruimall.controller;

import com.hit.neuruimall.model.OrderItemModel;
import com.hit.neuruimall.service.IOrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderItemController {

    @Autowired
    private IOrderItemService orderItemService;

    @GetMapping("/getAllOrderId")
    public List<Integer> getAllOrderId() {
        return orderItemService.getAllOrderId();
    }

    @GetMapping("/getOrderById")
    public List<OrderItemModel> getOrderById(Integer orderId) {
        return orderItemService.getById(orderId);
    }
}
