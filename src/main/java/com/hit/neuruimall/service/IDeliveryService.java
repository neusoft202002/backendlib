package com.hit.neuruimall.service;

import com.hit.neuruimall.model.DeliveryModel;

import java.util.List;

public interface IDeliveryService {

    public List<DeliveryModel> getAllDelivery();

    public List<DeliveryModel> getAllDeliveryWithUserId(Integer userId);

    public List<DeliveryModel> getByStatus(Integer deliveryStatusId);

    public void deleteById(Integer deliveryId);

    public void insert(Integer orderId);

    public List<DeliveryModel> updateStatus(Integer deliveryId, Integer deliveryStatusId, Integer oldStatusId);

    public List<DeliveryModel> userUpdateStatus(Integer userId, Integer deliveryId, Integer deliveryStatusId);

}
