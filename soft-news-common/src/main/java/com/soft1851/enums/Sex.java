package com.soft1851.enums;

/**
 * @author xunmi
 */

public enum Sex {
    /**
     * 性别男
     */
    Man(1,"男"),
    WoMan(2,"女");

    public final Integer type;
    public final String value;

    Sex(Integer type,String value){
        this.type = type;
        this.value = value;
    }
}
