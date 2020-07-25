package com.hit.neuruimall.controller;

import com.hit.neuruimall.model.UserModel;
import com.hit.neuruimall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @ResponseBody
    @GetMapping("/getAllUser")
    public List<UserModel> getAllUser() {
        return userService.getByAll();
    }
}
