package com.zw.food.daomain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "carousel")
public class Carousel {

    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 图片 图片地址
     */
    private String imageUrl;

    /**
     * 背景色
     */
    private String backgroundColor;

    /**
     * 商品id 商品id
     */
    private String itemId;

    /**
     * 商品分类id 商品分类id
     */
    private String catId;

    /**
     * 轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     */
    private Integer type;

    /**
     * 轮播图展示顺序
     */
    private Integer sort;

    /**
     * 是否展示
     */
    private Integer isShow;

    /**
     * 创建时间 创建时间
     */
    private Date createTime;

    /**
     * 更新时间 更新
     */
    private Date updateTime;


}