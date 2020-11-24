package com.soft1851.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
/**
 * @author xunmi
 * @ClassName NewAdminBO
 * @Description TODO
 * @Date 2020/11/24
 * @Version 1.0
 **/
public class Category {
    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTagColor() {
        return tagColor;
    }

    public void setTagColor(String tagColor) {
        this.tagColor = tagColor;
    }

    private String name;

    @Column(name = "tag_color")
    private String tagColor;
}
