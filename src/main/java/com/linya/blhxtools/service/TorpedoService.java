package com.linya.blhxtools.service;

import com.linya.blhxtools.dao.TorpedoDao;
import com.linya.blhxtools.entity.Torpedo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TorpedoService {
    @Resource
    TorpedoDao torpedoDao;

    public Torpedo find(String name){
        return torpedoDao.findById(name).orElseThrow(() -> new IllegalArgumentException(name + " not found"));

    }

    public void addOrUpdate(Torpedo torpedo){
        torpedoDao.save(torpedo);
    }
}
