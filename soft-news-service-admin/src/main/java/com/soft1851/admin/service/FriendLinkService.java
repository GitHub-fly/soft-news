package com.soft1851.admin.service;

import com.soft1851.pojo.mo.FriendLinkMO;

/**
 * @author xunmi
 * @ClassName FriendLinkService
 * @Description TODO
 * @Date 2020/11/24
 * @Version 1.0
 **/
public interface FriendLinkService {

    /**
     * 新增或者更新友链
     *
     * @param friendLinkMO
     */
    void saveOrUpdateFriendLink(FriendLinkMO friendLinkMO);
}
