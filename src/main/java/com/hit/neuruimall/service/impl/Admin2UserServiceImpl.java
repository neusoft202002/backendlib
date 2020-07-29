package com.hit.neuruimall.service.impl;

import com.hit.neuruimall.mapper.Admin2UserMapper;
import com.hit.neuruimall.service.IAdmin2UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Admin2UserServiceImpl implements IAdmin2UserService {

    @Autowired
    Admin2UserMapper admin2UserMapper;

    @Override
    public Integer getAdmin2UserId(String adminName) {
        return admin2UserMapper.selectAdmin2UserId(adminName);
    }
}
