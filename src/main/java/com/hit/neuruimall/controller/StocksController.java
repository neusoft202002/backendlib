package com.hit.neuruimall.controller;

import com.hit.neuruimall.model.StocksModel;
import com.hit.neuruimall.service.IStocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StocksController {

    @Autowired
    IStocksService stocksService;

    @GetMapping("/updateQuantity")
    public void updateQuantity(Integer proId, Integer quantity) {
        stocksService.updateQuantity(proId, quantity);
    }

    @PostMapping("/insertStocks")
    public boolean insertStocks(StocksModel stocksModel) {
        stocksService.insert(stocksModel);
        return true;
    }

    @PostMapping("/updateStocks")
    public boolean updateStocks(StocksModel stocksModel) {
        stocksService.update(stocksModel);
        return true;
    }
}
