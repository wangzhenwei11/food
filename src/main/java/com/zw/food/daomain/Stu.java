package com.zw.food.daomain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "stu")
public class Stu {
    @Id
    private Integer id;

    private String name;

    private Integer age;

}