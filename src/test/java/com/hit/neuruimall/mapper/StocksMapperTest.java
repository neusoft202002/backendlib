package com.hit.neuruimall.mapper;

import com.hit.neuruimall.model.StocksModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StocksMapperTest {

    @Autowired
    StocksMapper stocksMapper;

    @Test
    void updateQuantity() {
        stocksMapper.updateQuantity(1, 15);
    }

    @Test
    void updateWarehouse() {
        StocksModel stocksModel = new StocksModel();
        stocksModel.setProId(10);
        stocksModel.setWarehouse("11号");
        stocksModel.setQuantity(21);
        stocksMapper.update(stocksModel);
    }

    @Test
    void insert() {
        StocksModel stocksModel = new StocksModel();
        stocksModel.setProId(6);
        stocksModel.setQuantity(10);
        stocksModel.setWarehouse("8号");
        stocksMapper.insert(stocksModel);
    }
}