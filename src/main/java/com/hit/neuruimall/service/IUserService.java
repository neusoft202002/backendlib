package com.hit.neuruimall.service;

import com.hit.neuruimall.model.UserModel;

import java.util.List;

public interface IUserService {

    public List<UserModel> getByAll();

    public UserModel getById(Integer id);

    public UserModel insert(UserModel userModel);

    public UserModel update(UserModel userModel);

    public void deleteById(Integer id);
}
