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
public class kansens_search {
    @Id
    @Column(length = 10)
    @PrimaryKeyJoinColumn
    private String name;

    @Column(length = 10, nullable = false)
    private String type;

    @Column(length = 5, nullable = false)
    private String rarity;

    @Column(length = 10, nullable = false)
    private String camp;

}
