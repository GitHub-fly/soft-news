package com.soft1851.enums;

/**
 * @author xunmi
 */

public enum ArticleCoverType {
    /**
     * 文章封面类型
     */
    ONE_IMAGE(1, "单图"),
    WORDS(2, "纯文字");

    public final Integer type;
    public final String value;

    ArticleCoverType(Integer type, String value) {
        this.type = type;
        this.value = value;
    }

}
