package com.hit.neuruimall.mapper;

import com.hit.neuruimall.model.OrderModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderMapper {

    public List<OrderModel> selectByAll();

    public List<OrderModel> selectByAllById(Integer userId);

    public List<OrderModel> selectByStatus(Integer statusId);

    public void deleteById(Integer orderId);

    public void updateStatus(Integer orderId, Integer statusId);

    public void insertOrder(OrderModel orderModel);

    public void insertOrderInfo(Integer orderId, Integer proId, Integer amount);

    public List<Integer> selectIdWithoutDelivery();
}
