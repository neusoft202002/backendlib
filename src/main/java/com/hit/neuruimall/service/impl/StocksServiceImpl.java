package com.hit.neuruimall.service.impl;

import com.hit.neuruimall.mapper.StocksMapper;
import com.hit.neuruimall.model.StocksModel;
import com.hit.neuruimall.service.IStocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StocksServiceImpl implements IStocksService {

    @Autowired
    private StocksMapper stocksMapper;

    @Override
    public void updateQuantity(Integer proId, Integer quantity) {
        stocksMapper.updateQuantity(proId, quantity);
    }

    @Override
    public void update(StocksModel stocksModel){
        stocksMapper.update(stocksModel);
    }

    @Override
    public void insert(StocksModel stocksModel) {
        stocksMapper.insert(stocksModel);
    }
}
