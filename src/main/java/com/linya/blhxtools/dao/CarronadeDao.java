package com.linya.blhxtools.dao;

import com.linya.blhxtools.entity.Carronade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


// spring jpa

public interface CarronadeDao extends JpaRepository<Carronade, String> {
//
//    Optional<Carronade> findByHp(int hp);

}
