package com.hit.neuruimall.service;

import com.hit.neuruimall.model.AllCartModel;

import java.util.List;

public interface IAllCartService {

    public List<AllCartModel> getAllCart();

    public List<AllCartModel> getByAllDynamic(String dynamicUsername, Integer minAccount, Integer maxAccount);
}
