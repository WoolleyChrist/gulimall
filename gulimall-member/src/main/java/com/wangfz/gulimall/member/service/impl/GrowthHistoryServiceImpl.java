package com.wangfz.gulimall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wangfz.common.utils.PageUtils;
import com.wangfz.common.utils.Query;

import com.wangfz.gulimall.member.dao.GrowthHistoryDao;
import com.wangfz.gulimall.member.entity.GrowthHistoryEntity;
import com.wangfz.gulimall.member.service.GrowthHistoryService;


@Service("growthHistoryService")
public class GrowthHistoryServiceImpl extends ServiceImpl<GrowthHistoryDao, GrowthHistoryEntity> implements GrowthHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GrowthHistoryEntity> page = this.page(
                new Query<GrowthHistoryEntity>().getPage(params),
                new QueryWrapper<GrowthHistoryEntity>()
        );

        return new PageUtils(page);
    }

}