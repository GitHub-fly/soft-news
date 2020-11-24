package com.soft1851.enums;

/**
 * @author xunmi
 */

public enum YesOrNo {
    /**
     * 是否通过
     */
    NO(0, "否"),
    Yes(1, "是");

    public final Integer type;
    public final String value;

    YesOrNo(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
