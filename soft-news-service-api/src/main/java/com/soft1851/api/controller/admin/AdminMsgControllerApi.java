package com.soft1851.api.controller.admin;

import com.soft1851.pojo.bo.AdminLoginBO;
import com.soft1851.result.GraceResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author xunmi
 * @ClassName AdminMsgControllerApi
 * @Description TODO
 * @Date 2020/11/20
 * @Version 1.0
 **/
@Api(value = "管理员维护", tags = {"管理员维护 controller"})
@RequestMapping("adminMsg")
public interface AdminMsgControllerApi {

    /**
     * 管理员登录
     *
     * @param adminLoginBO
     * @param request
     * @param response
     * @return
     */
    @ApiOperation(value = "管理员登录", notes = "管理员登录", httpMethod = "POST")
    @PostMapping("/adminLogin")
    GraceResult adminLogin(@RequestBody AdminLoginBO adminLoginBO,
                           HttpServletRequest request,
                           HttpServletResponse response);
}
