package com.hit.neuruimall.service.impl;

import com.hit.neuruimall.mapper.AdminUserMapper;
import com.hit.neuruimall.model.AdminUserModel;
import com.hit.neuruimall.service.IAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminUserServiceImpl implements IAdminUserService {

    @Autowired
    private AdminUserMapper adminUserMapper;


    @Override
    public List<AdminUserModel> findAllUser() {
        return adminUserMapper.selectAllUser();
    }

    @Override
    public boolean validate(String username, String password) {
        AdminUserModel adminUserModel = adminUserMapper.selectByName(username);
        return adminUserModel != null && adminUserModel.getPassword() != null && adminUserModel.getPassword().equals(password);
    }
}
