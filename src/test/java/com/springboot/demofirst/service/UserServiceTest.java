package com.springboot.demofirst.service;

import com.springboot.demofirst.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    //查找男性用户
    public void findUpAll() {
        List<User> upAll = userService.findUpAll();
        for (User user:upAll) {
            System.out.println(user.getUsername());
        }
        Assert.assertNotNull(upAll);
    }
}