package com.wangfz.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangfz.common.utils.PageUtils;
import com.wangfz.gulimall.member.entity.UserAddressEntity;

import java.util.Map;

/**
 * 收货地址表
 *
 * @author wangfz
 * @email 1071839341@qq.com
 * @date 2021-11-16 22:00:26
 */
public interface UserAddressService extends IService<UserAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

