package com.example.demo.controller;

import com.example.demo.entity.Memo;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User index(@PathVariable Long id){

        return userService.getUser(id);
    }

    @RequestMapping(value = "/memo/{id}", method = RequestMethod.GET)
    public Memo getMemo(@PathVariable Long id){

        return userService.getMemo(id);
    }
}
