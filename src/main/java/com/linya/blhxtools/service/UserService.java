package com.linya.blhxtools.service;

import com.linya.blhxtools.dao.UserDao;
import com.linya.blhxtools.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService implements UserDetailsService {

    @Resource
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDao.findById(username).orElseThrow(() -> new UsernameNotFoundException(username + " not found"));
    }

    public void addOrUpdate(String u, String p) {
        User user = new User();
        user.setUsername(u);
        user.setPassword(p);
        userDao.save(user);
    }

}
