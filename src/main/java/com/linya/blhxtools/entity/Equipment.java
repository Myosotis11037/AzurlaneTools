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
public class Equipment {
    //设备名字
    @Id
    @Column
    private String name;

    //设备属性1
    @Column(nullable = false, length = 10)
    private String attribute1;

    //设备属性2
    @Column
    private String attribute2;

    //设备属性3
    @Column
    private String attribute3;

    //设备属性4
    @Column
    private String attribute4;

    public boolean isValid(){
        return name != null && attribute1 != null;
    }
}
