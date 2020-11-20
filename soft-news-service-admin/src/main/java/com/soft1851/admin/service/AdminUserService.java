package com.soft1851.admin.service;

import com.soft1851.pojo.AdminUser;
import com.soft1851.pojo.bo.NewAdminBO;
import com.soft1851.utils.PageGridResult;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xunmi
 * @ClassName AdminUserService
 * @Description TODO
 * @Date 2020/11/20
 * @Version 1.0
 **/
public interface AdminUserService {

    /**
     * 获得管理员用户信息
     *
     * @param username
     * @return
     */
    AdminUser queryAdminByUsername(String username);

    /**
     * 新增管理员
     *
     * @param newAdminBO
     */
    void createAdminUser(NewAdminBO newAdminBO);

    /**
     * 分页查询管理员列表
     *
     * @param page
     * @param pageSize
     * @return
     */
    PageGridResult queryAdminList(Integer page, Integer pageSize);
}
