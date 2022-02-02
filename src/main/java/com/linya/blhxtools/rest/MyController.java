package com.linya.blhxtools.rest;

import com.linya.blhxtools.Result;
import com.linya.blhxtools.entity.Carronade;
import com.linya.blhxtools.entity.KansensSearch;
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

    @GetMapping("/find/kansen/{name}")
    public ResponseEntity<Result<KansensSearch>> findKansens(@PathVariable String name){
        try{
            return Result.ok(kansensService.find(name));
        }
        catch(IllegalArgumentException e){
            return ResponseEntity.status(490).body(new Result<>(490, e.getMessage(), null));
        }
    }


    @PostMapping("/add/kansen/{name}")
    public String addKansens(@PathVariable String name, @RequestParam String type, @RequestParam String rarity, @RequestParam String camp){
        kansensService.addOrUpdate(name, type, rarity, camp);
        return "OK";
    }


//    @GetMapping("/find/carronade")
//    public ResponseEntity<Result<String>> findByHp(@RequestParam int hp) {
//        return Result.ok(carronadeService.findNameByHp(hp));
//    }

    @GetMapping("/find/carronade")
    public ResponseEntity<Result<Carronade>> find(@PathVariable String name) {
        try {
            return Result.ok(carronadeService.find(name));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(490).body(new Result<>(490, e.getMessage(), null));
        }
    }


    @PostMapping("/find/carronade/{name}")
    public String add(@PathVariable String name,
                      @RequestParam String type,
                      @RequestParam String damage,
                      @RequestParam int damage_correction,
                      @RequestParam double speeding,
                      @RequestParam int artillery,
                      @RequestParam int antiaircraft,
                      @RequestParam String characteristic,
                      @RequestParam String ammunition,
                      @RequestParam int search_range,
                      @RequestParam int search_angle,
                      @RequestParam String ammo_distance,
                      @RequestParam int spread_angle,
                      @RequestParam int damage_range,
                      @RequestParam int spread_range,
                      @RequestParam String camp,
                      @RequestParam String alias) {
        carronadeService.addOrUpdate(name, type, damage, damage_correction,speeding,artillery,antiaircraft,characteristic,ammunition,search_range,search_angle,ammo_distance,spread_angle,damage_range,spread_range,camp,alias);
        return "OK";
    }

}
