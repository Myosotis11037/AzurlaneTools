package com.linya.blhxtools.service;

import com.linya.blhxtools.dao.KansensSearchDao;
import com.linya.blhxtools.entity.KansensSearch;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class KansensService {

    @Resource
    KansensSearchDao kansensSearchDao;

    public KansensSearch find(String name){
        return kansensSearchDao.findById(name).orElseThrow(() -> new IllegalArgumentException(name + " not found"));
    }

    public void addOrUpdate(String name, String type, String rarity, String camp) {
        KansensSearch kansen = new KansensSearch(name, type, rarity, camp);
        kansensSearchDao.save(kansen);
    }

    public void addOrUpdate(KansensSearch kansen) {
        kansensSearchDao.save(kansen);
    }
}
