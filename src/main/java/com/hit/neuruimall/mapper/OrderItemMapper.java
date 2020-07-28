package com.hit.neuruimall.mapper;

import com.hit.neuruimall.model.OrderItemModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderItemMapper {

    public List<Integer> selectAllOrderId();

    public List<OrderItemModel> selectById(Integer orderId);

}
