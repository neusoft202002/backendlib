package com.hit.neuruimall.controller;

import com.hit.neuruimall.model.UserModel;
import com.hit.neuruimall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/getAllUser")
    public List<UserModel> getAllUser() {
        return userService.getByAll();
    }

    @GetMapping("/getAddress")
    public List<UserModel> getAllUserWithAddress() {
        return userService.getByAllWithAddress();
    }

    @GetMapping("/getById")
    public UserModel getById(Integer id) {
        return userService.getById(id);
    }

    @PostMapping("/insertUser")
    public boolean insertUser(UserModel userModel) {
        userService.insert(userModel);
        return true;
    }

    @PostMapping("/updateUser")
    public boolean updateUser(UserModel userModel) {
        userService.update(userModel);
        return true;
    }

    @RequestMapping("/deleteUser/{id}")
    public boolean deleteById(@PathVariable("id") Integer id) {
        System.out.println(id);
//        userService.deleteById(id);
        return true;
    }

}
