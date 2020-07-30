package com.hit.neuruimall.service;

import com.hit.neuruimall.model.WarningModel;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

public interface IWarningService {

    public List<WarningModel> getOrderWarning();

    public List<WarningModel> getStocksWarning();

    public List<WarningModel> getUserWarning();

    public List<WarningModel> getOrderWarningDynamic(String info, Date startDate, Date endDate);

    public List<WarningModel> getStocksWarningDynamic(String info, Date startDate, Date endDate);

    public List<WarningModel> getUserWarningDynamic(String info, Date startDate, Date endDate);

    public void insertOrderWarning(WarningModel warningModel);

    public void insertStocksWarning(WarningModel warningModel);

    public void insertUserWarning(WarningModel warningModel);

    public void updateOrderWarning(WarningModel warningModel);

    public void updateStocksWarning(WarningModel warningModel);

    public void updateUserWarning(WarningModel warningModel);

    public void deleteOrderWarning(Integer orderWarningId);

    public void deleteStocksWarning(Integer stocksWarningId);

    public void deleteUserWarning(Integer userWarningId);

}
