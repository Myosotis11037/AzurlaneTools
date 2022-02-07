package com.linya.blhxtools.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

//舰炮实体类
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carronade {

    //舰炮名字，是游戏中舰炮的官方名字
    @Id
    @Column(length = 32)
    @PrimaryKeyJoinColumn
    private String name;

    //舰炮类型，比如：驱逐炮，重巡炮等
    @Column(nullable = false, length = 10)
    private String type;

    //强化满伤害值
    @Column(nullable = false, length = 10)
    private String damage;

    //伤害补正
    @Column(nullable = false)
    private int damage_correction;

    //强化满射速
    @Column(nullable = false)
    private double speeding;

    //炮击值，此值是装备了该舰炮的舰娘可以获得的属性加成，并不是每一门舰炮都有
    @Column
    private int artillery;

    //防空值，同炮击值的说明，也是并非每一门舰炮都有
    @Column
    private int antiaircraft;

    //特性，有的舰炮是锁定、有的舰炮是散射
    @Column(nullable = false)
    private String characteristic;

    //弹药，一共有通常弹、穿甲弹、高爆弹三种
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

    //伤害范围
    @Column
    private int damage_range;

    //散布范围
    @Column
    private int spread_range;

    //所属阵营，例如重樱、铁血
    @Column(length = 10, nullable = false)
    private String camp;

    //舰炮的别名，例如 138.6mm单装炮Mle1929T3 也叫 凯旋炮
    @Column
    private String alias;


    public boolean isValid() {
        return name != null
                && type != null
                && damage != null
                && characteristic != null
                && ammunition != null
                && camp != null;
    }
}
