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
    public List<UserModel> getByAllWithAddress() {
        return userMapper.selectByAllWithAddress();
    }

    @Override
    public UserModel getById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public void insert(UserModel userModel) {
        userMapper.insert(userModel);
    }

    @Override
    public void update(UserModel userModel) {
        userMapper.update(userModel);
    }

    @Override
    public void deleteById(Integer id) {
        userMapper.deleteById(id);
    }
}
