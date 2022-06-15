package com.linya.blhxtools.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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


}
