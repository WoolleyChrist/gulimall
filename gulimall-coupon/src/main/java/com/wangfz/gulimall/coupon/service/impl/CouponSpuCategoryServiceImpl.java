package com.wangfz.gulimall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wangfz.common.utils.PageUtils;
import com.wangfz.common.utils.Query;

import com.wangfz.gulimall.coupon.dao.CouponSpuCategoryDao;
import com.wangfz.gulimall.coupon.entity.CouponSpuCategoryEntity;
import com.wangfz.gulimall.coupon.service.CouponSpuCategoryService;


@Service("couponSpuCategoryService")
public class CouponSpuCategoryServiceImpl extends ServiceImpl<CouponSpuCategoryDao, CouponSpuCategoryEntity> implements CouponSpuCategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponSpuCategoryEntity> page = this.page(
                new Query<CouponSpuCategoryEntity>().getPage(params),
                new QueryWrapper<CouponSpuCategoryEntity>()
        );

        return new PageUtils(page);
    }

}