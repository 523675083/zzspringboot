package com.example.zzspringboot.controller;

import com.example.zzspringboot.pojo.Resource;
import com.example.zzspringboot.pojo.UserInfo;
import com.example.zzspringboot.utils.RestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private Resource resource;

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

    @RequestMapping("/getResource")
    public RestModel getResource(){
        System.out.println(resource.getName());
        return RestModel.data(resource.getSex());
    }

    @RequestMapping("/exception")
    public RestModel exception(){
        int i=1/0;
        return null;
    }
}
