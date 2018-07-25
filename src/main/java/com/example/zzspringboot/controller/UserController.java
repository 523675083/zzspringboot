package com.example.zzspringboot.controller;

import com.example.zzspringboot.pojo.UserInfo;
import com.example.zzspringboot.utils.RestModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    public RestModel getUser(){
        UserInfo userInfo=new UserInfo();
        userInfo.setAge(32);
        userInfo.setUsername("李四");
        userInfo.setPassword("123456");
        userInfo.setBirthday(new Date());
        userInfo.setDesc(null);
        return RestModel.data(userInfo);
    }
}
