package com.soft1851.pojo.mo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * @author xunmi
 * @ClassName FriendLinkMO
 * @Description TODO
 * @Date 2020/11/24
 * @Version 1.0
 **/
@Document("FriendLink")
public class FriendLinkMO {
    @Id
    private String id;
    @Field("link_name")
    private String linkName;
    @Field("link_url")
    private String linkUrl;
    @Field("is_delete")
    private Integer isDelete;
    @Field("create_time")
    private Date createTime;
    @Field("update_time")
    private Date updateTime;

    public FriendLinkMO(String id, String linkName, String linkUrl, Integer isDelete, Date createTime, Date updateTime) {
        this.id = id;
        this.linkName = linkName;
        this.linkUrl = linkUrl;
        this.isDelete = isDelete;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public FriendLinkMO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
