package com.lxk.springbootdouble.controller;


import com.lxk.springbootdouble.entity.db1.User;
import com.lxk.springbootdouble.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/select/list")
    public List<User> selectUserList() {
        return this.userService.selectUserList();
    }

    @GetMapping("/save")
    public void saveUser(User user) {
        this.userService.saveUser(user);
    }


}