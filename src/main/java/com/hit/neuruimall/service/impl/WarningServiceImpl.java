package com.hit.neuruimall.service.impl;

import com.hit.neuruimall.mapper.WarningMapper;
import com.hit.neuruimall.model.WarningModel;
import com.hit.neuruimall.service.IWarningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WarningServiceImpl implements IWarningService {

    @Autowired
    private WarningMapper warningMapper;

    @Override
    public List<WarningModel> getOrderWarning() {
        return warningMapper.selectOrderWarning();
    }

    @Override
    public List<WarningModel> getStocksWarning() {
        return warningMapper.selectStocksWarning();
    }

    @Override
    public List<WarningModel> getUserWarning() {
        return warningMapper.selectUserWarning();
    }

    @Override
    public List<WarningModel> getOrderWarningDynamic(String info, Date startDate, Date endDate) {
        if(info!=null && info.trim().length()>0) {
            info="%"+info+"%";
        }
        return warningMapper.selectOrderWarningDynamic(info, startDate, endDate);
    }

    @Override
    public List<WarningModel> getStocksWarningDynamic(String info, Date startDate, Date endDate) {
        if(info!=null && info.trim().length()>0) {
            info="%"+info+"%";
        }
        return warningMapper.selectStocksWarningDynamic(info, startDate, endDate);
    }

    @Override
    public List<WarningModel> getUserWarningDynamic(String info, Date startDate, Date endDate) {
        if(info!=null && info.trim().length()>0) {
            info="%"+info+"%";
        }
        return warningMapper.selectUserWarningDynamic(info, startDate, endDate);
    }

    @Override
    public void insertOrderWarning(WarningModel warningModel) {
        warningMapper.insertOrderWarning(warningModel);
    }

    @Override
    public void insertStocksWarning(WarningModel warningModel) {
        warningMapper.insertStocksWarning(warningModel);
    }

    @Override
    public void insertUserWarning(WarningModel warningModel) {
        warningMapper.insertUserWarning(warningModel);
    }

    @Override
    public void updateOrderWarning(WarningModel warningModel) {
        warningMapper.updateOrderWarning(warningModel);
    }

    @Override
    public void updateStocksWarning(WarningModel warningModel) {
        warningMapper.updateStocksWarning(warningModel);
    }

    @Override
    public void updateUserWarning(WarningModel warningModel) {
        warningMapper.updateUserWarning(warningModel);
    }

    @Override
    public void deleteOrderWarning(Integer orderWarningId) {
        warningMapper.deleteOrderWarning(orderWarningId);
    }

    @Override
    public void deleteStocksWarning(Integer stocksWarningId) {
        warningMapper.deleteStocksWarning(stocksWarningId);
    }

    @Override
    public void deleteUserWarning(Integer userWarningId) {
        warningMapper.deleteUserWarning(userWarningId);
    }
}
