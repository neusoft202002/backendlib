package com.hit.neuruimall.service;

import com.hit.neuruimall.model.UserModel;

import java.util.List;

public interface IUserService {

    public List<UserModel> getByAll();

    public List<UserModel> getByAllWithAddress();

    public UserModel getById(Integer id);

    public void insert(UserModel userModel);

    public void update(UserModel userModel);

    public void deleteById(Integer id);
}
