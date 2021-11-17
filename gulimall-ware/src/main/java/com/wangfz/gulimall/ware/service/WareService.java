package com.wangfz.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangfz.common.utils.PageUtils;
import com.wangfz.gulimall.ware.entity.WareEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author wangfz
 * @email 1071839341@qq.com
 * @date 2021-11-16 22:11:48
 */
public interface WareService extends IService<WareEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

