package com.wangfz.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangfz.common.utils.PageUtils;
import com.wangfz.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author wangfz
 * @email 1071839341@qq.com
 * @date 2021-11-16 22:06:51
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

