package com.hit.neuruimall.service.impl;

import com.hit.neuruimall.mapper.OrderMapper;
import com.hit.neuruimall.model.OrderModel;
import com.hit.neuruimall.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<OrderModel> getByAll() {
        return orderMapper.selectByAll();
    }

    @Override
    public List<OrderModel> getByAllById(Integer userId) {
        return orderMapper.selectByAllById(userId);
    }

    @Override
    public List<OrderModel> getByStatus(Integer statusId) {
        return orderMapper.selectByStatus(statusId);
    }

    @Override
    public void deleteById(Integer orderId) {
        orderMapper.deleteById(orderId);
    }

    @Override
    public void updateStatus(Integer orderId, Integer statusId) {
        orderMapper.updateStatus(orderId, statusId);
    }

    @Override
    public void insert(Integer userId, String proIds, String amounts) {
        String[] proIdArray = proIds.trim().split(" ");
        String[] amountArray = amounts.trim().split(" ");
        OrderModel orderModel = new OrderModel();
        orderModel.setUserId(userId);
        orderMapper.insertOrder(orderModel);
        System.out.println(orderModel);
        int orderId = orderModel.getOrderId();
        for (int i = 0; i < proIdArray.length; i++) {
            orderMapper.insertOrderInfo(orderId, Integer.parseInt(proIdArray[i]), Integer.parseInt(amountArray[i]));
        }
    }

    @Override
    public List<Integer> getIdWithoutDelivery() {
        return orderMapper.selectIdWithoutDelivery();
    }
}
