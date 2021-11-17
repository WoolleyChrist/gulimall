package com.wangfz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangfz.common.utils.PageUtils;
import com.wangfz.gulimall.product.entity.CommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author wangfz
 * @email 1071839341@gmail.com
 * @date 2021-11-15 21:20:07
 */
public interface CommentService extends IService<CommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

