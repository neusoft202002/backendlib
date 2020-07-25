package com.hit.neuruimall.service.impl;

import com.hit.neuruimall.mapper.UserMapper;
import com.hit.neuruimall.model.UserModel;
import com.hit.neuruimall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserModel> getByAll() {
        return userMapper.selectByAll();
    }

    @Override
    public UserModel getById(Integer id) {
        return null;
    }

    @Override
    public UserModel insert(UserModel userModel) {
        return null;
    }

    @Override
    public UserModel update(UserModel userModel) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
