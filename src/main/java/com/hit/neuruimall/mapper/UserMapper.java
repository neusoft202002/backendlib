package com.hit.neuruimall.mapper;

import com.hit.neuruimall.model.UserModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<UserModel> selectByAll();

    public List<UserModel> selectByAllWithAddress();

    public UserModel selectById(Integer id);

    public void insert(UserModel userModel);

    public void update(UserModel userModel);

    public void deleteById(Integer id);
}
