package com.linya.blhxtools.service;

import com.linya.blhxtools.dao.AircraftDao;
import com.linya.blhxtools.entity.Aircraft;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AircraftService {
    @Resource
    AircraftDao aircraftDao;

    public Aircraft find(String name){
        return aircraftDao.findById(name).orElseThrow(() -> new IllegalArgumentException(name + " not found"));
    }

    public void addOrUpdate(Aircraft aircraft){
        aircraftDao.save(aircraft);
    }


}
