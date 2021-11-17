package com.wangfz.gulimall.order.dao;

import com.wangfz.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author wangfz
 * @email 1071839341@qq.com
 * @date 2021-11-16 22:06:51
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
