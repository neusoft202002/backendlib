package com.hit.neuruimall.mapper;

import com.hit.neuruimall.model.UserModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<UserModel> selectByAll();

    public UserModel selectById(Integer id);

    public UserModel insert(UserModel userModel);

    public UserModel update(UserModel userModel);

    public void deleteById(Integer id);
}
