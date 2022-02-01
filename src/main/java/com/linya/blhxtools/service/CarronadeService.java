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

    public void addOrUpdate(String name, int hp, String armor) {
        Carronade carronade = new Carronade(name, hp, armor);
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
