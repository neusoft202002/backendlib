package com.hit.neuruimall.service;

import com.hit.neuruimall.model.OrderItemModel;

import java.util.List;

public interface IOrderItemService {

    public List<Integer> getAllOrderId();

    public List<OrderItemModel> getById(Integer orderId);

    public List<Integer> getAllOrderIdWithUserId(Integer userId);
}
