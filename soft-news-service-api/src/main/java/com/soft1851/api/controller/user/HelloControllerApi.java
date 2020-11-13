package com.soft1851.api.controller.user;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xunmi
 * @ClassName HelloControllerApi
 * @Description TODO
 * @Date 2020/11/13
 * @Version 1.0
 **/
public interface HelloControllerApi {
    /**
     * hello 接口
     *
     * @return
     */
    @GetMapping("/hello")
    Object hello();
}
