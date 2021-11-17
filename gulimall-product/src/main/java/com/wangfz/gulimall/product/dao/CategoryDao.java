package com.wangfz.gulimall.product.dao;

import com.wangfz.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wangfz
 * @email 1071839341@gmail.com
 * @date 2021-11-15 21:20:07
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
