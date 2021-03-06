package com.soft1851.api.controller.user;

import com.soft1851.pojo.bo.UpdateUserInfoBO;
import com.soft1851.result.GraceResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author xunmi
 * @ClassName UserController
 * @Description TODO
 * @Date 2020/11/14
 * @Version 1.0
 **/
@Api(value = "用户信息相关Controller", tags = {"用户信息相关Controller"})
@RequestMapping("user")
public interface UserControllerApi {

    /**
     * 获得所有用户信息
     *
     * @return
     */
    @ApiOperation(value = "获得所有用户信息", notes = "获得所有用户信息", httpMethod = "GET")
    @GetMapping("/all")
    GraceResult getAllUsers();

    /**
     * 获得用户基本信息
     *
     * @param userId
     * @return
     */
    @ApiOperation(value = "获得用户账号信息", notes = "获得用户账号信息", httpMethod = "POST")
    @PostMapping("/userBasicInfo")
    GraceResult getUserInfo(@RequestParam String userId);

    /**
     * 完善用户信息
     *
     * @param updateUserInfoBO
     * @param result
     * @return
     */
    @ApiOperation(value = "完善用户信息", notes = "完善用户信息", httpMethod = "POST")
    @PostMapping("/updateUserInfo")
    GraceResult updateUserInfo(@RequestBody @Valid UpdateUserInfoBO updateUserInfoBO, BindingResult result);

    /**
     * 获得用户基础信息
     *
     * @param userId
     * @return
     */
    @ApiOperation(value = "获得用户基础信息", notes = "获得用户基础信息", httpMethod = "POST")
    @PostMapping("/getUserInfo")
    GraceResult getUserBasicInfo(@RequestParam String userId);

    /**
     * 根据用户的ids查询用户列表
     *
     * @param userIds
     * @return
     */
    @ApiOperation(value = "根据用户的ids查询用户列表", notes = "根据用户的ids查询用户列表", httpMethod = "GET")
    @GetMapping("/queryByIds")
    GraceResult queryByIds(@RequestParam String userIds);
}
