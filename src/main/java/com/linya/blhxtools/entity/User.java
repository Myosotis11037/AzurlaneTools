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

    @Column
    private String password;

    @Column
    private String authorities;
}
