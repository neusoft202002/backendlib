package com.hit.neuruimall.service;

import com.hit.neuruimall.model.AdminUserModel;

import java.util.List;

public interface IAdminUserService {

    public List<AdminUserModel> findAllUser();

    public boolean validate(String username, String password);
}
