package com.wangfz.gulimall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wangfz.common.utils.PageUtils;
import com.wangfz.common.utils.Query;

import com.wangfz.gulimall.ware.dao.WareOrderBillDetailDao;
import com.wangfz.gulimall.ware.entity.WareOrderBillDetailEntity;
import com.wangfz.gulimall.ware.service.WareOrderBillDetailService;


@Service("wareOrderBillDetailService")
public class WareOrderBillDetailServiceImpl extends ServiceImpl<WareOrderBillDetailDao, WareOrderBillDetailEntity> implements WareOrderBillDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareOrderBillDetailEntity> page = this.page(
                new Query<WareOrderBillDetailEntity>().getPage(params),
                new QueryWrapper<WareOrderBillDetailEntity>()
        );

        return new PageUtils(page);
    }

}