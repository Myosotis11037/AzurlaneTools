package com.linya.blhxtools.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//表示用户的实体类
@Entity
@Data
public class User{

    @Id
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String authorities;

    public boolean isValid(){
        return username != null && password != null && authorities != null;
    }
}
