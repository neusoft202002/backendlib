package com.hit.neuruimall.controller;

import com.hit.neuruimall.model.WarningModel;
import com.hit.neuruimall.service.IWarningService;
import com.hit.neuruimall.service.impl.WarningServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class WarningController {

    @Autowired
    private IWarningService warningService;

    @GetMapping("/getOrderWarning")
    public List<WarningModel> getOrderWarning() {
        return warningService.getOrderWarning();
    }

    @GetMapping("/getStocksWarning")
    public List<WarningModel> getStocksWarning() {
        return warningService.getStocksWarning();
    }

    @GetMapping("/getUserWarning")
    public List<WarningModel> getUserWarning() {
        return warningService.getUserWarning();
    }

    @PostMapping("/getOrderWarningDynamic")
    public List<WarningModel> getOrderWarningDynamic(String info, @RequestParam(required=false) @DateTimeFormat(pattern="yyyy/MM/dd") Date startDate, @RequestParam(required=false) @DateTimeFormat(pattern="yyyy/MM/dd") Date endDate) {
        return warningService.getOrderWarningDynamic(info, startDate, endDate);
    }

    @PostMapping("/getStocksWarningDynamic")
    public List<WarningModel> getStocksWarningDynamic(String info, @RequestParam(required=false) @DateTimeFormat(pattern="yyyy/MM/dd") Date startDate, @RequestParam(required=false) @DateTimeFormat(pattern="yyyy/MM/dd") Date endDate) {
        return warningService.getStocksWarningDynamic(info, startDate, endDate);
    }

    @PostMapping("/getUserWarningDynamic")
    public List<WarningModel> getUserWarningDynamic(String info, @RequestParam(required=false) @DateTimeFormat(pattern="yyyy/MM/dd") Date startDate, @RequestParam(required=false) @DateTimeFormat(pattern="yyyy/MM/dd") Date endDate) {
        return warningService.getUserWarningDynamic(info, startDate, endDate);
    }

    @PostMapping("/insertOrderWarning")
    public boolean insertOrderWarning(WarningModel warningModel) {
        warningService.insertOrderWarning(warningModel);
        return true;
    }

    @PostMapping("/insertStocksWarning")
    public boolean insertStocksWarning(WarningModel warningModel) {
        warningService.insertStocksWarning(warningModel);
        return true;
    }

    @PostMapping("/insertUserWarning")
    public boolean insertUserWarning(WarningModel warningModel) {
        warningService.insertUserWarning(warningModel);
        return true;
    }

    @PostMapping("/updateOrderWarning")
    public boolean updateOrderWarning(WarningModel warningModel) {
        warningService.updateOrderWarning(warningModel);
        return true;
    }

    @PostMapping("/updateStocksWarning")
    public boolean updateStocksWarning(WarningModel warningModel) {
        warningService.updateStocksWarning(warningModel);
        return true;
    }

    @PostMapping("/updateUserWarning")
    public boolean updateUserWarning(WarningModel warningModel) {
        warningService.updateUserWarning(warningModel);
        return true;
    }

    @GetMapping("/deleteOrderWarning")
    public List<WarningModel> deleteOrderWarning(Integer orderWarningId) {
        warningService.deleteOrderWarning(orderWarningId);
        return warningService.getOrderWarning();
    }

    @GetMapping("/deleteStocksWarning")
    public List<WarningModel> deleteStocksWarning(Integer stocksWarningId) {
        warningService.deleteStocksWarning(stocksWarningId);
        return warningService.getStocksWarning();
    }

    @GetMapping("/deleteUserWarning")
    public List<WarningModel> deleteUserWarning(Integer userWarningId) {
        warningService.deleteUserWarning(userWarningId);
        return warningService.getUserWarning();
    }
}
