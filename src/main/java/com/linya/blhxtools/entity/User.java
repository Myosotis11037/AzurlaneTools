package com.linya.blhxtools.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.List;

//表示用户的实体类
@Entity
@Data
public class User implements UserDetails {

    @Id
    private String username;

    @Column
    @JsonIgnore
    private String password;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "username")
    private List<MyAuthority> authorities;

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
