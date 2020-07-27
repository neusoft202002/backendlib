package com.hit.neuruimall.mapper;

import com.hit.neuruimall.model.AddressModel;
import org.apache.ibatis.type.Alias;

@Alias("address")
public interface AddressMapper {

    public void insert(AddressModel addressModel);

    public void deleteById(Integer id);

    public void update(AddressModel addressModel);
}
