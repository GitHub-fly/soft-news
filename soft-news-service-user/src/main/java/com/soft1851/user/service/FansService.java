package com.soft1851.user.service;

import com.soft1851.enums.Sex;
import com.soft1851.pojo.vo.RegionRatioVO;

import java.util.List;

/**
 * @author xunmi
 * @ClassName FansService
 * @Description TODO
 * @Date 2020/11/26
 * @Version 1.0
 **/
public interface FansService {
    /**
     * 查询当前用户是否关注作者
     *
     * @param writerId 作者id
     * @param fanId    粉丝id
     * @return
     */
    boolean isMeFollowThisWriter(String writerId, String fanId);

    /**
     * 关注作者，成为粉丝
     * @param writerId 作者Id
     * @param fanId 粉丝Id
     */
    void follow(String writerId, String fanId);

    /**
     * 取消关注
     * @param writerId 作者id
     * @param fanId 粉丝id
     */
    void unfollow(String writerId, String fanId);

    /**
     * 按性别统计粉丝数
     * @param writerId 作者id
     * @param sex 性别
     * @return
     */
    Integer queryFansCounts(String writerId, Sex sex);

    /**
     * 根据地域查询粉丝数量
     * @param writerId 作者Id
     * @return
     */
    List<RegionRatioVO> queryRatioByRegion(String writerId);
}
