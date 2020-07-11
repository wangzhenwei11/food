package com.zw.food.pojo.vo;

import lombok.Data;

import java.util.List;

@Data
public class RootCatVO {

    private Integer id;

    private String name;

    private Integer type;

    private Integer fatherId;

    private Integer subId;

    private String subName;

    private Integer subType;

    private Integer subFatherId;

    private List<SubCategoryVO> subCategoryVOS;

}
