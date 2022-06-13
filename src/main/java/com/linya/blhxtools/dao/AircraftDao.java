package com.linya.blhxtools.dao;

import com.linya.blhxtools.entity.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AircraftDao extends JpaRepository<Aircraft, String> {

}
