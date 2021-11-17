package com.wangfz.gulimall.coupon.dao;

import com.wangfz.gulimall.coupon.entity.CouponSpuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author wangfz
 * @email 1071839341@qq.com
 * @date 2021-11-16 20:47:51
 */
@Mapper
public interface CouponSpuDao extends BaseMapper<CouponSpuEntity> {
	
}
