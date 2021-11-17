package com.wangfz.gulimall.member.dao;

import com.wangfz.gulimall.member.entity.UserStatisticsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 统计信息表
 * 
 * @author wangfz
 * @email 1071839341@qq.com
 * @date 2021-11-16 22:00:26
 */
@Mapper
public interface UserStatisticsDao extends BaseMapper<UserStatisticsEntity> {
	
}
