package com.soft1851.user.controller;

import com.soft1851.api.BaseController;
import com.soft1851.api.controller.user.FansControllerApi;
import com.soft1851.result.GraceResult;
import com.soft1851.user.service.FansService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xunmi
 * @ClassName FansController
 * @Description TODO
 * @Date 2020/11/17
 * @Version 1.0
 **/
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class FansController extends BaseController implements FansControllerApi {
    private final FansService fanServices;

    /**
     * @param writerId 作者id
     * @param fanId    粉丝id
     * @return
     */
    @Override
    public GraceResult isMeFollowThisWriter(String writerId, String fanId) {
        boolean result = fanServices.isMeFollowThisWriter(writerId, fanId);
        return GraceResult.ok(result);
    }

    /**
     * @param writerId 作者id
     * @param fanId    粉丝id
     * @return
     */
    @Override
    public GraceResult follow(String writerId, String fanId) {
        // 判断不为空
        fanServices.follow(writerId, fanId);
        return GraceResult.ok();
    }

    /**
     *
     * @param writerId 作者id
     * @param fanId 粉丝id
     * @return
     */
    @Override
    public GraceResult unfollow(String writerId, String fanId) {
        fanServices.unfollow(writerId, fanId);
        return GraceResult.ok();
    }

}