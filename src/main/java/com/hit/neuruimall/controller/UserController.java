package com.hit.neuruimall.controller;

import com.hit.neuruimall.model.UserModel;
import com.hit.neuruimall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/getAllUser")
    public List<UserModel> getAllUser() {
        return userService.getByAll();
    }

    @GetMapping("/getAllId")
    public List<Integer> getAllId() {
        return userService.getAllId();
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
//        System.out.println(userModel);
        userService.insert(userModel);
        return true;
    }

    @PostMapping("/updateUser")
    public boolean updateUser(UserModel userModel) {
        userService.update(userModel);
        return true;
    }

    @RequestMapping("/deleteUser/{id}")
    public List<UserModel> deleteById(@PathVariable("id") Integer id) {
//        System.out.println(id);
        userService.deleteById(id);
        return userService.getByAll();
    }

    @PostMapping("/getUserDynamic")
    public List<UserModel> getDynamic(String username, Integer minAge, Integer maxAge, @RequestParam(required=false) @DateTimeFormat(pattern="yyyy/MM/dd") Date startDate, @RequestParam(required=false) @DateTimeFormat(pattern="yyyy/MM/dd") Date endDate) {
        return userService.getDynamic(username, minAge, maxAge, startDate, endDate);
    }

}
