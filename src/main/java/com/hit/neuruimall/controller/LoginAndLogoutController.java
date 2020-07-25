package com.hit.neuruimall.controller;

import com.hit.neuruimall.exception.NoUserException;
import com.hit.neuruimall.model.AdminUserModel;
import com.hit.neuruimall.service.IAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginAndLogoutController {

    @Autowired
    IAdminUserService userService;

    @ResponseBody
    @PostMapping("/login")
    public void login(@RequestParam("name") String username,
                      @RequestParam("password") String password,
                      HttpSession session) {
        if (userService.validate(username, password)) {
            session.setAttribute("adminUsername", username);
        } else {
            throw new NoUserException();
        }
    }

    @ResponseBody
    @GetMapping("/logout")
    public boolean logout(HttpSession session, SessionStatus sessionStatus) {
        session.invalidate();
        sessionStatus.setComplete();
        return true;
    }

    @ResponseBody
    @RequestMapping("/find")
    public List<AdminUserModel> findAllUser() {
        return userService.findAllUser();
    }
}
