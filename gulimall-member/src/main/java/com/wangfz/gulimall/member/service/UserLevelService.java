package com.wangfz.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangfz.common.utils.PageUtils;
import com.wangfz.gulimall.member.entity.UserLevelEntity;

import java.util.Map;

/**
 * 会员等级表
 *
 * @author wangfz
 * @email 1071839341@qq.com
 * @date 2021-11-16 22:00:26
 */
public interface UserLevelService extends IService<UserLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

