package com.linya.blhxtools.controller;

import com.linya.blhxtools.Result;
import com.linya.blhxtools.entity.carronade;
import com.linya.blhxtools.entity.kansens_search;
import com.linya.blhxtools.service.CarronadeService;
import com.linya.blhxtools.service.KansensService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class MyController {

    @Resource
    private CarronadeService carronadeService;

    @Resource
    private KansensService kansensService;

    @GetMapping("/login")
    public ResponseEntity<Result<String>> login(){
        return Result.ok("Hello Bug!");
    }

    @GetMapping("/find/kansen/{name}")
    public ResponseEntity<Result<kansens_search>> findKansens(@RequestParam String name){
        try{
            return Result.ok(kansensService.find(name));
        }
        catch(IllegalArgumentException e){
            return ResponseEntity.status(490).body(new Result<>(490, e.getMessage(), null));
        }
    }





//    @GetMapping("/find/carronade")
//    public ResponseEntity<Result<String>> findByHp(@RequestParam int hp) {
//        return Result.ok(carronadeService.findNameByHp(hp));
//    }

    @GetMapping("/find/carronade/{name}")
    public ResponseEntity<Result<carronade>> find(@PathVariable String name) {
        try {
            return Result.ok(carronadeService.find(name));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(490).body(new Result<>(490, e.getMessage(), null));
        }
    }


    @PostMapping("/find/{name}")
    public String add(@PathVariable String name, @RequestParam int hp, @RequestParam String armor) {
        carronadeService.addOrUpdate(name, hp, armor);
        return "OK";
    }

}
