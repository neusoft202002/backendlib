package com.hit.neuruimall.service;

import com.hit.neuruimall.model.StocksModel;

public interface IStocksService {

    public void updateQuantity(Integer proId, Integer quantity);

    public void update(StocksModel stocksModel);

    public void insert(StocksModel stocksModel);
}
