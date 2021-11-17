package com.wangfz.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangfz.common.utils.PageUtils;
import com.wangfz.gulimall.ware.entity.WareOrderBillEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author wangfz
 * @email 1071839341@qq.com
 * @date 2021-11-16 22:11:48
 */
public interface WareOrderBillService extends IService<WareOrderBillEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

