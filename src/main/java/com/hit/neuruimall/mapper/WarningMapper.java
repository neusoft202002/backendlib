package com.hit.neuruimall.mapper;

import com.hit.neuruimall.model.WarningModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface WarningMapper {

    public List<WarningModel> selectOrderWarning();

    public List<WarningModel> selectStocksWarning();

    public List<WarningModel> selectUserWarning();

    public List<WarningModel> selectOrderWarningDynamic(String info, Date startDate, Date endDate);

    public List<WarningModel> selectStocksWarningDynamic(String info, Date startDate, Date endDate);

    public List<WarningModel> selectUserWarningDynamic(String info, Date startDate, Date endDate);

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
