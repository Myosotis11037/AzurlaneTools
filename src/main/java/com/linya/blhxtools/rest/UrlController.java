package com.linya.blhxtools.rest;

import com.linya.blhxtools.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@Controller
public class UrlController {
    @GetMapping("index")
    public String getIndex(){
        return "index";
    }

    @GetMapping("404")
    public String get404(){
        return "404";
    }

    @GetMapping("test")
    public String myTest(Model model){
        model.addAttribute("name","凛夜");
        return "test";
    }

    @GetMapping("login")
    public String getLogin(){
        return "login";
    }

    @GetMapping("register")
    public String getRegister(){
        return "register";
    }

    @Resource
    UserService userService;


}
