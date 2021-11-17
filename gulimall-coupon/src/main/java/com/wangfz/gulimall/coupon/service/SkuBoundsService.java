package com.wangfz.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangfz.common.utils.PageUtils;
import com.wangfz.gulimall.coupon.entity.SkuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author wangfz
 * @email 1071839341@qq.com
 * @date 2021-11-16 20:47:51
 */
public interface SkuBoundsService extends IService<SkuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

