package com.hit.neuruimall.service.impl;

import com.hit.neuruimall.mapper.DeliveryMapper;
import com.hit.neuruimall.model.DeliveryModel;
import com.hit.neuruimall.service.IDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryServiceImpl implements IDeliveryService {

    @Autowired
    private DeliveryMapper deliveryMapper;

    @Override
    public List<DeliveryModel> getAllDelivery() {
        return deliveryMapper.selectAllDelivery();
    }

    @Override
    public List<DeliveryModel> getAllDeliveryDynamic(String dynamicName) {
        if(dynamicName!=null && dynamicName.trim().length()>0) {
            dynamicName="%"+dynamicName+"%";
        }
        return deliveryMapper.selectAllDeliveryDynamic(dynamicName);
    }

    @Override
    public List<DeliveryModel> getAllDeliveryWithUserId(Integer userId) {
        return deliveryMapper.selectAllDeliveryWithUserId(userId);
    }


    @Override
    public List<DeliveryModel> getByStatus(Integer deliveryStatusId) {
        return deliveryMapper.selectByStatus(deliveryStatusId);
    }

    @Override
    public void deleteById(Integer deliveryId) {
        deliveryMapper.deleteById(deliveryId);
    }

    @Override
    public void insert(Integer orderId) {
        deliveryMapper.insert(orderId);
    }

    @Override
    public List<DeliveryModel> updateStatus(Integer deliveryId, Integer deliveryStatusId, Integer oldStatusId) {
        deliveryMapper.updateStatus(deliveryId, deliveryStatusId);
        return deliveryMapper.selectByStatus(oldStatusId);
    }

    @Override
    public List<DeliveryModel> userUpdateStatus(Integer userId, Integer deliveryId, Integer deliveryStatusId) {
        deliveryMapper.updateStatus(deliveryId, deliveryStatusId);
        return deliveryMapper.selectAllDeliveryWithUserId(userId);
    }
}
