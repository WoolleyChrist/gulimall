package com.wangfz.gulimall.member.dao;

import com.wangfz.gulimall.member.entity.UserLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户登陆记录表
 * 
 * @author wangfz
 * @email 1071839341@qq.com
 * @date 2021-11-16 22:00:26
 */
@Mapper
public interface UserLoginLogDao extends BaseMapper<UserLoginLogEntity> {
	
}
