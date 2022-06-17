package com.linya.blhxtools.service;

import com.linya.blhxtools.dao.UserDao;
import com.linya.blhxtools.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public User find(String username) throws IllegalArgumentException {
        return userDao.findById(username).orElseThrow(() -> new IllegalArgumentException(username + " not found"));
    }

    public void addOrUpdate(User user) {
        userDao.save(user);
    }

}
