package com.linya.blhxtools.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//描述用户权限的实体类
@Entity
@Data
public class MyAuthority implements GrantedAuthority {

    @Id
    private String username;

    @Column
    private String authority;

}
