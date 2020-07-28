package com.hit.neuruimall.mapper;

import com.hit.neuruimall.model.CartModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CartMapper {

    public List<CartModel> selectByUserId(Integer userId);

    public void insert(CartModel cartModel);

    public void deleteById(Integer userId, Integer proId);

    public void updateAmount(CartModel cartModel);

}
