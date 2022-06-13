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
public class Aircraft {
    //舰载机名字
    @Id
    @Column(length = 32)
    private String name;

    //舰载机类型
    @Column(nullable = false, length = 10)
    private String type;

    //强化满射速
    @Column
    private double speeding;

    //航空值，有些垃圾飞机可能没有航空值
    @Column
    private int air;

    //所属阵营，例如重樱、铁血
    @Column(length = 10, nullable = false)
    private String camp;

    public boolean isValid() {
        return name != null
                && type != null
                && camp != null;
    }

}
