package com.linya.blhxtools.rest;

import com.linya.blhxtools.entity.User;
import com.linya.blhxtools.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    UserService userService;

    @PostMapping("/api/login")
    public ResponseEntity<String> login(@RequestBody User user){
        User myUser;
        //查找用户是否存在
        try{
            myUser = userService.find(user.getUsername());
        }catch(IllegalArgumentException e){
            return ResponseEntity.badRequest().build();
        }

        //查询密码
        if(myUser.getPassword().equals( user.getPassword())){
            return ResponseEntity.ok("OK");
        }else{
            return ResponseEntity.badRequest().build();
        }

    }

    @PostMapping("/api/register")
    public ResponseEntity<String> register(@RequestBody User user){
        if(!user.isValid()) return ResponseEntity.badRequest().build();
        userService.addOrUpdate(user);
        return ResponseEntity.ok("OK");
    }
}
