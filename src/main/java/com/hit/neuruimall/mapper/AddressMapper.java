package com.hit.neuruimall.mapper;

import com.hit.neuruimall.model.AddressModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressMapper {

    public void insert(AddressModel addressModel);

    public AddressModel selectById(Integer userId, Integer addressId);

    public Integer selectUserMaxAddressId(Integer userId);

    public void deleteById(Integer userId, Integer addressId);

    public void update(AddressModel addressModel);

    public List<Integer> selectUserAddressId(Integer id);
}
