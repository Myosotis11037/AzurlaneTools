package com.linya.blhxtools.rest;

import com.linya.blhxtools.Result;
import com.linya.blhxtools.entity.*;
import com.linya.blhxtools.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
public class MyController {
    @Resource
    private KansensService kansensService;

    @Resource
    private CarronadeService carronadeService;

    @Resource
    private FlakpanzerService flakpanzerService;

    @Resource
    private TorpedoService torpedoService;

    @Resource
    private AircraftService aircraftService;

    @Resource
    private EquipmentService equipmentService;

    @GetMapping("/kansen/{name}")
    public ResponseEntity<Result<KansensSearch>> findKansens(@PathVariable String name){
        try{
            return Result.ok(kansensService.find(name));
        }
        catch(IllegalArgumentException e){
            return ResponseEntity.status(490).body(new Result<>(490, e.getMessage(), null));
        }
    }

    @PostMapping("/kansen")
    public ResponseEntity<String> addKansens(@RequestBody KansensSearch kansensSearch){
        if(!kansensSearch.isValid())
            return ResponseEntity.badRequest().build();
        kansensService.addOrUpdate(kansensSearch);
        return ResponseEntity.ok("OK");
    }

//    @GetMapping("/find/carronade")
//    public ResponseEntity<Result<String>> findByHp(@RequestParam int hp) {
//        return Result.ok(carronadeService.findNameByHp(hp));
//    }

    @GetMapping("/carronade/{name}")
    public ResponseEntity<Result<Carronade>> findCarronade(@PathVariable String name) {
        try {
            return Result.ok(carronadeService.find(name));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(490).body(new Result<>(490, e.getMessage(), null));
        }
    }

    @PostMapping("/carronade")
    public ResponseEntity<String> addCarronade(@RequestBody Carronade carronade) {
        if(!carronade.isValid())
            return ResponseEntity.badRequest().build();
        carronadeService.addOrUpdate(carronade);
        return ResponseEntity.ok("OK");
    }

    @GetMapping("/flakpanzer/{name}")
    public ResponseEntity<Result<Flakpanzer>> findFlakpanzer(@PathVariable String name){
        try {
            return Result.ok(flakpanzerService.find(name));
        }catch(IllegalArgumentException e){
            return ResponseEntity.status(490).body(new Result<>(490, e.getMessage(), null));
        }
    }

    @PostMapping("/flakpanzer")
    public ResponseEntity<String> addFlakpanzer(@RequestBody Flakpanzer flakpanzer){
        if(!flakpanzer.isValid())
            return ResponseEntity.badRequest().build();
        flakpanzerService.addOrUpdate(flakpanzer);
        return ResponseEntity.ok("OK");
    }

    @GetMapping("torpedo/{name}")
    public ResponseEntity<Result<Torpedo>> findTorpedo(@PathVariable String name){
        try {
            return Result.ok(torpedoService.find(name));
        }
        catch(IllegalArgumentException e){
            return ResponseEntity.status(490).body(new Result<>(490, e.getMessage(),null));
        }
    }

    @PostMapping("torpedo")
    public ResponseEntity<String> addTorpedo(@RequestBody Torpedo torpedo){
        if(!torpedo.isValid())
            return ResponseEntity.badRequest().build();
        torpedoService.addOrUpdate(torpedo);
        return ResponseEntity.ok("OK");
    }

    @GetMapping("aircraft/{name}")
    public ResponseEntity<Result<Aircraft>> findAircraft(@PathVariable String name){
        try{
            return Result.ok(aircraftService.find(name));
        }
        catch(IllegalArgumentException e){
            return ResponseEntity.status(490).body(new Result<>(490,e.getMessage(), null));
        }
    }

    @PostMapping("aircraft")
    public ResponseEntity<String> addAircraft(@RequestBody Aircraft aircraft){
        if(!aircraft.isValid())
            return ResponseEntity.badRequest().build();
        aircraftService.addOrUpdate(aircraft);
        return ResponseEntity.ok("OK");
    }

    @GetMapping("equipment/{name}")
    public ResponseEntity<Result<Equipment>> findEquipment(@PathVariable String name){
        try{
            return Result.ok(equipmentService.find(name));
        }
        catch(IllegalArgumentException e){
            return ResponseEntity.status(490).body(new Result<>(490, e.getMessage(), null));
        }
    }

    @PostMapping("equipment")
    public ResponseEntity<String> addEquipment(@RequestBody Equipment equipment){
        if(!equipment.isValid())
            return ResponseEntity.badRequest().build();
        equipmentService.addOrUpdate(equipment);
        return ResponseEntity.ok("OK");
    }


}
