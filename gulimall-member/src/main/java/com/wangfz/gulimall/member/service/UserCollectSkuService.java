package com.wangfz.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangfz.common.utils.PageUtils;
import com.wangfz.gulimall.member.entity.UserCollectSkuEntity;

import java.util.Map;

/**
 * 关注商品表
 *
 * @author wangfz
 * @email 1071839341@qq.com
 * @date 2021-11-16 22:00:26
 */
public interface UserCollectSkuService extends IService<UserCollectSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

