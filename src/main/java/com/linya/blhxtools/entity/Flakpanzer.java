package com.linya.blhxtools.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//防空炮实体类
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flakpanzer {

    //防空炮名字
    @Id
    @Column(length = 32)
    private String name;

    //强化满伤害值
    @Column(nullable = false)
    private int damage;

    //防空炮强化满射速
    @Column(nullable = false)
    private double speeding;

    //防空炮索敌范围
    @Column(nullable = false)
    private int range;

    //防空值，此值是装备了该防空炮的舰娘可以获得的防空属性加成
    @Column(nullable = false)
    private int antiaircraft;

    //命中
    @Column
    private int accuracy;

    //炮击值，绝大多数防空炮不会提供此属性加成
    @Column
    private int artillery;

    //所属阵营
    @Column(nullable = false)
    private String camp;

    //防空炮别名
    @Column
    private String alias;


    public boolean isValid(){
        return name != null && camp != null;
    }
}
