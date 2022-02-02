package com.linya.blhxtools.service;

import com.linya.blhxtools.dao.CarronadeDao;
import com.linya.blhxtools.entity.Carronade;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CarronadeService {

    @Resource
    private CarronadeDao carronadeDao;

    public Carronade find(String name) {
        return carronadeDao.findById(name).orElseThrow(() -> new IllegalArgumentException(name + " not found"));
    }

    public void addOrUpdate(String name,
                            String type,
                            String damage,
                            int damage_correction,
                            double speeding,
                            int artillery,
                            int antiaircraft,
                            String characteristic,
                            String ammunition,
                            int search_range,
                            int search_angle,
                            String ammo_distance,
                            int spread_angle,
                            int damage_range,
                            int spread_range,
                            String camp,
                            String alias){

        Carronade carronade = new Carronade(name, type, damage, damage_correction,speeding,artillery,antiaircraft,characteristic,ammunition,search_range,search_angle,ammo_distance,spread_angle,damage_range,spread_range,camp,alias);

        carronadeDao.save(carronade);
    }

//    public String findNameByHp(int hp) {
//        Optional<carronade> carronade = carronadeDao.findByHp(hp);
//        if (carronade.isPresent()) {
//            return carronade.get().getName();
//        } else {
//            return "not found";
//        }
//    }

}
