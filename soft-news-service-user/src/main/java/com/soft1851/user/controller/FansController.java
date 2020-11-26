package com.soft1851.user.controller;

import com.soft1851.api.BaseController;
import com.soft1851.api.controller.user.FansControllerApi;
import com.soft1851.enums.Sex;
import com.soft1851.pojo.vo.FansCountsVO;
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
    /**
     *
     * @param writerId 作者id
     * @return
     */
    @Override
    public GraceResult queryRatio(String writerId) {
        int manCounts = fanServices.queryFansCounts(writerId, Sex.Man);
        int womanCounts = fanServices.queryFansCounts(writerId, Sex.WoMan);
        FansCountsVO fansCountsVO = new FansCountsVO();
        fansCountsVO.setManCounts(manCounts);
        fansCountsVO.setWomanCounts(womanCounts);
        return GraceResult.ok(fansCountsVO);
    }

    /**
     *
     * @param writerId 作者Id
     * @return
     */
    @Override
    public GraceResult queryRatioByRegion(String writerId) {
        return GraceResult.ok(fanServices.queryRatioByRegion(writerId));
    }
}