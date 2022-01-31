package com.linya.blhxtools.controller;

import com.linya.blhxtools.Result;
import com.linya.blhxtools.entity.Carronade;
import com.linya.blhxtools.service.MyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class MyController {

    @Resource
    private MyService myService;

    @GetMapping("/login")
    public ResponseEntity<Result<String>> login(){
        return Result.ok("Hello Bug!");
    }

    @GetMapping("/find")
    public ResponseEntity<Result<String>> findByHp(@RequestParam int hp) {
        return Result.ok(myService.findNameByHp(hp));
    }

    @GetMapping("/find/{name}")
    public ResponseEntity<Result<Carronade>> find(@PathVariable String name) {
        try {
            return Result.ok(myService.find(name));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(490).body(new Result<>(490, e.getMessage(), null));
        }
    }


    @PostMapping("/find/{name}")
    public String add(@PathVariable String name, @RequestParam int hp) {
        myService.addOrUpdate(name, hp);
        return "OK";
    }

}
