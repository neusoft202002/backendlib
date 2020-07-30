package com.hit.neuruimall.mapper;

import com.hit.neuruimall.model.DeliveryModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeliveryMapper {

    public List<DeliveryModel> selectAllDelivery();

    public List<DeliveryModel> selectAllDeliveryDynamic(String dynamicName);

    public List<DeliveryModel> selectAllDeliveryWithUserId(Integer userId);

    public List<DeliveryModel> selectByStatus(Integer deliveryStatusId);

    public void deleteById(Integer deliveryId);

    public void insert(Integer orderId);

    public void updateStatus(Integer deliveryId, Integer deliveryStatusId);
}
