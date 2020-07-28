package com.hit.neuruimall.mapper;

import com.hit.neuruimall.model.StocksModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StocksMapper {

    public void updateQuantity(Integer proId, Integer quantity);

    public void update(StocksModel stocksModel);

    public void insert(StocksModel stocksModel);
}
