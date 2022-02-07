package com.linya.blhxtools.service;

import com.linya.blhxtools.dao.FlakpanzerDao;
import com.linya.blhxtools.entity.Flakpanzer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FlakpanzerService {
    @Resource
    FlakpanzerDao flakpanzerDao;

    public Flakpanzer find(String name){
        return flakpanzerDao.findById(name).orElseThrow(() -> new IllegalArgumentException(name + " not found"));
    }

    public void addOrUpdate(Flakpanzer flakpanzer){
        flakpanzerDao.save(flakpanzer);
    }

}
