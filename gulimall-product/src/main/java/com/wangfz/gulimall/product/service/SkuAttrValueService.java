package com.wangfz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangfz.common.utils.PageUtils;
import com.wangfz.gulimall.product.entity.SkuAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author wangfz
 * @email 1071839341@gmail.com
 * @date 2021-11-15 21:20:07
 */
public interface SkuAttrValueService extends IService<SkuAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

