package com.zw.food.common.enums;

/**
 * 是否枚举
 */
public enum YesOrNo {


    NO(0,"否"),
    YES(1,"是");

    private final Integer type;

    private final String value;

    YesOrNo(Integer type, String value) {
        this.type = type;
        this.value = value;
    }

    public Integer getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
