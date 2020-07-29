package com.hit.neuruimall.controller;

import com.hit.neuruimall.service.IAdmin2UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Admin2UserController {

    @Autowired
    IAdmin2UserService admin2UserService;

    @GetMapping("/getAdmin2UserId")
    public Integer getAdmin2UserId(String adminName) {
        return admin2UserService.getAdmin2UserId(adminName);
    }
}
