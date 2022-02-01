package com.linya.blhxtools.rest;

import com.linya.blhxtools.entity.User;
import com.linya.blhxtools.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    UserService userService;

    @GetMapping("/user/{username}")
    public UserDetails user(@RequestParam String username){
        return userService.loadUserByUsername(username);
    }

    @PostMapping("/user/{username}")
    public String addUser(@RequestParam String username, @RequestParam String password){
        userService.addOrUpdate(username, password);
        return "OK";
    }
}
