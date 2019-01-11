package com.springboot.demofirst.controller;

import com.springboot.demofirst.pojo.User;
import com.springboot.demofirst.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemoController {

    @Autowired
    private UserService userService;

    @GetMapping("hello")
    public User hello() {
        //return "hello,springboot!";
        User user = this.userService.queryById(10);
        return user;
    }

}
