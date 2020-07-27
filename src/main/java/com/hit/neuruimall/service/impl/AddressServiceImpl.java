package com.hit.neuruimall.service.impl;

import com.hit.neuruimall.mapper.AddressMapper;
import com.hit.neuruimall.model.AddressModel;
import com.hit.neuruimall.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    AddressMapper addressMapper;

    @Override
    public void insert(AddressModel addressModel) {
        Integer maxAddressId = addressMapper.selectUserMaxAddressId(addressModel.getUserId());
        if (maxAddressId == null) {
            maxAddressId = 0;
        }
        addressModel.setAddressId(maxAddressId + 1);
        addressMapper.insert(addressModel);
    }

    @Override
    public AddressModel getById(Integer userId, Integer addressId) {
        return addressMapper.selectById(userId, addressId);
    }

    @Override
    public void deleteById(Integer userId, Integer addressId) {
        addressMapper.deleteById(userId, addressId);
    }

    @Override
    public void update(AddressModel addressModel) {
        addressMapper.update(addressModel);
    }

    @Override
    public List<Integer> getUserAddressId(Integer id) {
        return addressMapper.selectUserAddressId(id);
    }
}
