package com.hit.neuruimall.mapper;

import com.hit.neuruimall.model.AllCartModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AllCartMapper {

    public List<AllCartModel> selectByAll();

    public List<AllCartModel> selectByAllDynamic(String dynamicUsername, Integer minAccount, Integer maxAccount);
}
