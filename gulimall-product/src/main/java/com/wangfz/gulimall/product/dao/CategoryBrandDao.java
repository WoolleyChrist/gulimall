package com.wangfz.gulimall.product.dao;

import com.wangfz.gulimall.product.entity.CategoryBrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author wangfz
 * @email 1071839341@gmail.com
 * @date 2021-11-15 21:20:07
 */
@Mapper
public interface CategoryBrandDao extends BaseMapper<CategoryBrandEntity> {
	
}
