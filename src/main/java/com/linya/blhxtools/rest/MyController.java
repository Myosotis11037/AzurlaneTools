package com.linya.blhxtools.rest;

import com.linya.blhxtools.Result;
import com.linya.blhxtools.entity.Carronade;
import com.linya.blhxtools.entity.KansensSearch;
import com.linya.blhxtools.entity.User;
import com.linya.blhxtools.service.CarronadeService;
import com.linya.blhxtools.service.KansensService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class MyController {

    @Resource
    private CarronadeService carronadeService;

    @Resource
    private KansensService kansensService;

    @GetMapping("/find/kansen/{name}")
    public ResponseEntity<Result<KansensSearch>> findKansens(@RequestParam String name){
        try{
            return Result.ok(kansensService.find(name));
        }
        catch(IllegalArgumentException e){
            return ResponseEntity.status(490).body(new Result<>(490, e.getMessage(), null));
        }
    }

    @PostMapping("/find/kansen/{name}")
    public String addKansens(@PathVariable String name, @PathVariable String type, @PathVariable String rarity, @PathVariable String camp){
        kansensService.addOrUpdate(name, type, rarity, camp);
        return "OK";
    }


//    @GetMapping("/find/carronade")
//    public ResponseEntity<Result<String>> findByHp(@RequestParam int hp) {
//        return Result.ok(carronadeService.findNameByHp(hp));
//    }

    @GetMapping("/find/carronade/{name}")
    public ResponseEntity<Result<Carronade>> find(@PathVariable String name) {
        try {
            return Result.ok(carronadeService.find(name));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(490).body(new Result<>(490, e.getMessage(), null));
        }
    }


    @PostMapping("/find/carronade/{name}")
    public String add(@PathVariable String name, @RequestParam int hp, @RequestParam String armor) {
        carronadeService.addOrUpdate(name, hp, armor);
        return "OK";
    }

}
