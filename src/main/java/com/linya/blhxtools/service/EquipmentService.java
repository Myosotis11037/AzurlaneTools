package com.linya.blhxtools.service;

import com.linya.blhxtools.dao.EquipmentDao;
import com.linya.blhxtools.entity.Equipment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EquipmentService {
    @Resource
    EquipmentDao equipmentDao;

    public Equipment find(String name){
        return equipmentDao.findById(name).orElseThrow(() -> new IllegalArgumentException(name + " not found"));

    }

    public void addOrUpdate(Equipment equipment){
        equipmentDao.save(equipment);
    }
}
