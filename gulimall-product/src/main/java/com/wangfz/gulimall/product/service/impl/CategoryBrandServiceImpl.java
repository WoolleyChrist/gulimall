package com.wangfz.gulimall.product.service.impl;

import com.wangfz.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wangfz.common.utils.Query;

import com.wangfz.gulimall.product.dao.CategoryBrandDao;
import com.wangfz.gulimall.product.entity.CategoryBrandEntity;
import com.wangfz.gulimall.product.service.CategoryBrandService;


@Service("categoryBrandService")
public class CategoryBrandServiceImpl extends ServiceImpl<CategoryBrandDao, CategoryBrandEntity> implements CategoryBrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryBrandEntity> page = this.page(
                new Query<CategoryBrandEntity>().getPage(params),
                new QueryWrapper<CategoryBrandEntity>()
        );

        return new PageUtils(page);
    }

}