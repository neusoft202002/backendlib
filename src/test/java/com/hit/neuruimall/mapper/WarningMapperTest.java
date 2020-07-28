package com.hit.neuruimall.mapper;

import com.hit.neuruimall.model.WarningModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WarningMapperTest {

    @Autowired
    WarningMapper warningMapper;

    @Test
    void selectOrderWarning() {
        System.out.println(warningMapper.selectOrderWarning());
    }

    @Test
    void selectStocksWarning() {
        System.out.println(warningMapper.selectStocksWarning());
    }

    @Test
    void selectUserWarning() {
        System.out.println(warningMapper.selectUserWarning());
    }

    @Test
    void insertOrderWarning() {
        WarningModel warningModel = new WarningModel();
        warningModel.setWarningInfo("test");
        warningModel.setWarningDate(new Date());
        warningMapper.insertOrderWarning(warningModel);
    }

    @Test
    void insertStocksWarning() {
        WarningModel warningModel = new WarningModel();
        warningModel.setWarningInfo("test");
        warningModel.setWarningDate(new Date());
        warningMapper.insertStocksWarning(warningModel);
    }

    @Test
    void insertUserWarning() {
        WarningModel warningModel = new WarningModel();
        warningModel.setWarningInfo("test");
        warningModel.setWarningDate(new Date());
        warningMapper.insertUserWarning(warningModel);
    }

    @Test
    void updateOrderWarning() {
        WarningModel warningModel = new WarningModel();
        warningModel.setWarningId(4);
        warningModel.setWarningInfo("test");
        warningModel.setWarningDate(new Date());
        warningMapper.updateOrderWarning(warningModel);
    }

    @Test
    void updateStocksWarning() {
        WarningModel warningModel = new WarningModel();
        warningModel.setWarningId(4);
        warningModel.setWarningInfo("newTest");
        warningModel.setWarningDate(new Date());
        warningMapper.updateStocksWarning(warningModel);
    }

    @Test
    void updateUserWarning() {
        WarningModel warningModel = new WarningModel();
        warningModel.setWarningId(4);
        warningModel.setWarningInfo("newTest");
        warningModel.setWarningDate(new Date());
        warningMapper.updateUserWarning(warningModel);
    }

    @Test
    void deleteOrderWarning() {
        warningMapper.deleteOrderWarning(3);
    }

    @Test
    void deleteStocksWarning() {
        warningMapper.deleteStocksWarning(4);
    }

    @Test
    void deleteUserWarning() {
        warningMapper.deleteUserWarning(4);
    }
}