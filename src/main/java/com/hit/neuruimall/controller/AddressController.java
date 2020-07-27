package com.hit.neuruimall.controller;

import com.hit.neuruimall.model.AddressModel;
import com.hit.neuruimall.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    IAddressService addressService;

    @GetMapping("/getAddressById")
    public AddressModel getAddressById(Integer userId, Integer addressId) {
        return addressService.getById(userId, addressId);
    }

    @GetMapping("/deleteAddress")
    public boolean deleteById(Integer userId, Integer addressId) {
        addressService.deleteById(userId, addressId);
        return true;
    }

    @GetMapping("/getUserAddressId")
    public List<Integer> getUserAddressId(Integer id) {
        return addressService.getUserAddressId(id);
    }

    @PostMapping("/updateAddress")
    public boolean update(AddressModel addressModel) {
        addressService.update(addressModel);
        return true;
    }

    @PostMapping("/insertAddress")
    public boolean insert(AddressModel addressModel) {
        addressService.insert(addressModel);
        return true;
    }
}
