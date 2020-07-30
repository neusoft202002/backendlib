package com.hit.neuruimall.service.impl;

import com.hit.neuruimall.mapper.AllCartMapper;
import com.hit.neuruimall.model.AllCartModel;
import com.hit.neuruimall.service.IAllCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllCartServiceImpl implements IAllCartService {

    @Autowired
    AllCartMapper allCartMapper;


    @Override
    public List<AllCartModel> getAllCart() {
        return allCartMapper.selectByAll();
    }

    @Override
    public List<AllCartModel> getByAllDynamic(String dynamicUsername, Integer minAccount, Integer maxAccount) {
        if(dynamicUsername!=null && dynamicUsername.trim().length()>0) {
            dynamicUsername="%"+dynamicUsername+"%";
        }
        return allCartMapper.selectByAllDynamic(dynamicUsername, minAccount, maxAccount);
    }
}
