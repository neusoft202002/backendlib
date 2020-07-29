package com.hit.neuruimall.controller;

import com.hit.neuruimall.model.OrderModel;
import com.hit.neuruimall.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    IOrderService orderService;

    @GetMapping("/getAllOrder")
    public List<OrderModel> getByAll(){
        return orderService.getByAll();
    }

    @GetMapping("/getAllOrderById")
    public List<OrderModel> getByAllById(Integer userId) {
        return orderService.getByAllById(userId);
    }

    @GetMapping("/getOrderByStatus")
    public List<OrderModel> getByStatus(Integer statusId){
        return orderService.getByStatus(statusId);
    }

    @GetMapping("/deleteOrderById")
    public List<OrderModel> deleteOrderById(Integer orderId){
        orderService.deleteById(orderId);
        return orderService.getByAll();
    }

    @GetMapping("/updateOrderStatus")
    public List<OrderModel> updateStatus(Integer orderId, Integer statusId, Integer oldStatusId) {
        orderService.updateStatus(orderId, statusId);
        return orderService.getByStatus(oldStatusId);
    }

    @PostMapping("/insertOrder")
    public boolean insertOrder(Integer userId, String proIds, String amounts) {
        orderService.insert(userId, proIds, amounts);
        return true;
    }

    @GetMapping("/getIdWithoutDelivery")
    public List<Integer> getIdWithoutDelivery() {
        return orderService.getIdWithoutDelivery();
    }
}
