package com.linya.blhxtools.dao;

import com.linya.blhxtools.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<User, String> {

}
