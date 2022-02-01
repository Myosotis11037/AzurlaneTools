package com.linya.blhxtools.dao;

import com.linya.blhxtools.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, String> {
}
