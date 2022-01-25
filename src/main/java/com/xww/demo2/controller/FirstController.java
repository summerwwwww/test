package com.xww.demo2.controller;

import com.xww.demo2.Service.UsersService;
import com.xww.demo2.entity.Users;
import com.xww.demo2.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @Autowired
    UsersService usersService;


    @RequestMapping("/")
    public Users one(String id){

        return usersService.getById(id);
    }
}
