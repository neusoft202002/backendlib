package com.hit.neuruimall.service.impl;

import com.hit.neuruimall.mapper.OrderItemMapper;
import com.hit.neuruimall.model.OrderItemModel;
import com.hit.neuruimall.service.IOrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements IOrderItemService {

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Override
    public List<Integer> getAllOrderId() {
        return orderItemMapper.selectAllOrderId();
    }

    @Override
    public List<OrderItemModel> getById(Integer orderId) {
        return orderItemMapper.selectById(orderId);
    }

    @Override
    public List<Integer> getAllOrderIdWithUserId(Integer userId) {
        return orderItemMapper.selectAllOrderIdWithUserId(userId);
    }
}
