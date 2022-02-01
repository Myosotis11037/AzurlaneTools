package com.linya.blhxtools.service;

import com.linya.blhxtools.dao.KansensSearchDao;
import com.linya.blhxtools.entity.kansens_search;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class KansensService {

    @Resource
    KansensSearchDao kansensSearchDao;

    public kansens_search find(String name){
        return kansensSearchDao.findById(name).orElseThrow(() -> new IllegalArgumentException(name + "not found"));
    }
}
