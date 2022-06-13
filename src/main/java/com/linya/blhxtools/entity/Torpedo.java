package com.linya.blhxtools.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Torpedo {
    //鱼雷名字
    @Id
    @Column(length = 32)
    private String name;

    //强化满伤害值
    @Column(nullable = false,length = 10)
    private String damage;

    //强化满射速
    @Column(nullable = false)
    private double speeding;

    //雷击值
    @Column
    private int lightning;

    //弹药类型，有声导鱼雷和通常鱼雷两种
    @Column(nullable = false)
    private String ammunition;

    //索敌范围
    @Column(nullable = false)
    private int search_range;

    //索敌角度
    @Column(nullable = false)
    private int search_angle;

    //弹药射程
    @Column
    private String ammo_distance;

    //散布角度
    @Column
    private int spread_angle;

    //所属阵营，例如重樱、铁血
    @Column(length = 10, nullable = false)
    private String camp;


    public boolean isValid(){
        return name != null
                && ammunition != null
                && camp != null;
    }
}
