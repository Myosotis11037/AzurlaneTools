package com.linya.blhxtools.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//存储舰娘主要信息的实体类，主要用于缩小舰娘的搜索范围
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KansensSearch{

    @Id
    @Column(length = 10)
    private String name;

    @Column(length = 10, nullable = false)
    private String type;

    @Column(length = 5, nullable = false)
    private String rarity;

    @Column(length = 10, nullable = false)
    private String camp;

    public boolean isValid() {
        return name != null && type != null && rarity != null && camp != null;
    }

}
