package com.wangfz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangfz.common.utils.PageUtils;
import com.wangfz.gulimall.product.entity.CategoryBrandEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author wangfz
 * @email 1071839341@gmail.com
 * @date 2021-11-15 21:20:07
 */
public interface CategoryBrandService extends IService<CategoryBrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

