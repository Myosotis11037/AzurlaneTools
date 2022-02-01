package com.linya.blhxtools.dao;

import com.linya.blhxtools.entity.carronade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


// spring jpa

public interface CarronadeDao extends JpaRepository<carronade, String> {

    Optional<carronade> findByHp(int hp);

}
