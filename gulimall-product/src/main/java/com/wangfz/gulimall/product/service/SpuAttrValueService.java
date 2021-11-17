package com.wangfz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangfz.common.utils.PageUtils;
import com.wangfz.gulimall.product.entity.SpuAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author wangfz
 * @email 1071839341@gmail.com
 * @date 2021-11-15 21:20:07
 */
public interface SpuAttrValueService extends IService<SpuAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

