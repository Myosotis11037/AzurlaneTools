package com.linya.blhxtools.dao;

import com.linya.blhxtools.entity.kansens_search;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface KansensSearchDao extends JpaRepository<kansens_search, String> {

}