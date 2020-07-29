package com.hit.neuruimall.controller;

import com.hit.neuruimall.model.DeliveryModel;
import com.hit.neuruimall.service.IDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeliveryController {

    @Autowired
    private IDeliveryService deliveryService;

    @GetMapping("/getAllDelivery")
    public List<DeliveryModel> getAllDelivery() {
        return deliveryService.getAllDelivery();
    }

    @GetMapping("/getAllDeliveryWithUserId")
    public List<DeliveryModel> getAllDeliveryWithUserId(Integer userId) {
        return deliveryService.getAllDeliveryWithUserId(userId);
    }

    @GetMapping("/getDeliveryByStatus")
    public List<DeliveryModel> getDeliveryByStatus(Integer deliveryStatusId) {
        return deliveryService.getByStatus(deliveryStatusId);
    }

    @GetMapping("/insertDelivery")
    public boolean insertDelivery(Integer orderId) {
        deliveryService.insert(orderId);
        return true;
    }

    @GetMapping("/deleteDeliveryById")
    public boolean deleteById(Integer deliveryId) {
        deliveryService.deleteById(deliveryId);
        return true;
    }

    @PostMapping("/updateDeliveryStatus")
    public List<DeliveryModel> updateStatus(Integer deliveryId, Integer deliveryStatusId, Integer oldStatusId) {
        return deliveryService.updateStatus(deliveryId, deliveryStatusId, oldStatusId);
    }

    @GetMapping("/userUpdateStatus")
    public List<DeliveryModel> userUpdateStatus(Integer userId, Integer deliveryId, Integer deliveryStatusId) {
        return deliveryService.userUpdateStatus(userId, deliveryId, deliveryStatusId);
    }
}
