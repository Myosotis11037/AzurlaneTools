package com.linya.blhxtools.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carronade {

    @Id
    @Column(length = 32)
    @PrimaryKeyJoinColumn
    private String name;

    @Column(nullable = false, length = 10)
    private int hp;

    @Column(nullable = false, length = 10)
    private String armor;



}
