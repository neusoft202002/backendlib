package com.hit.neuruimall.service;

import com.hit.neuruimall.model.OrderModel;

import java.util.List;

public interface IOrderService {

    public List<OrderModel> getByAll();

    public List<OrderModel> getByStatus(Integer statusId);

    public void deleteById(Integer orderId);

    public void updateStatus(Integer orderId, Integer statusId);

    public void insert(Integer userId, String proIds, String amounts);
}