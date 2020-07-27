package com.hit.neuruimall.mapper;

import com.hit.neuruimall.model.AddressModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AddressMapperTest {

    @Autowired
    AddressMapper addressMapper;

    @Test
    void insert() {
        AddressModel addressModel = new AddressModel();
        addressModel.setUserId(2);
        addressModel.setAddressId(2);
        addressModel.setReceiverName("two");
        addressModel.setPhone("15845623546");
        addressModel.setAddress("黑龙江省漠河市");
        addressMapper.insert(addressModel);
    }

    @Test
    void selectUserMaxAddressId() {
        System.out.println(addressMapper.selectUserMaxAddressId(2));
    }

    @Test
    void deleteById() {
        addressMapper.deleteById(1, 2);
    }

    @Test
    void update() {
        AddressModel addressModel = new AddressModel();
        addressModel.setUserId(2);
        addressModel.setAddressId(2);
        addressModel.setReceiverName("newTwo");
        addressModel.setPhone("156512365412");
        addressModel.setAddress("黑龙江省大庆");
        addressMapper.update(addressModel);
    }

    @Test
    void selectUserAddressId() {
        System.out.println(addressMapper.selectUserAddressId(1));
    }
}