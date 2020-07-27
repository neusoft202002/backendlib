package com.hit.neuruimall.service;

import com.hit.neuruimall.model.AddressModel;

import java.util.List;

public interface IAddressService {

    public void insert(AddressModel addressModel);

    public AddressModel getById(Integer userId, Integer addressId);

    public void deleteById(Integer userId, Integer addressId);

    public void update(AddressModel addressModel);

    public List<Integer> getUserAddressId(Integer id);
}
