package com.wangfz.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangfz.common.utils.PageUtils;
import com.wangfz.gulimall.coupon.entity.CouponSpuCategoryEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author wangfz
 * @email 1071839341@qq.com
 * @date 2021-11-16 20:47:50
 */
public interface CouponSpuCategoryService extends IService<CouponSpuCategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

