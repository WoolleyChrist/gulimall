package com.wangfz.gulimall.member.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wangfz.gulimall.member.entity.UserLevelEntity;
import com.wangfz.gulimall.member.service.UserLevelService;
import com.wangfz.common.utils.PageUtils;
import com.wangfz.common.utils.R;



/**
 * 会员等级表
 *
 * @author wangfz
 * @email 1071839341@qq.com
 * @date 2021-11-16 22:00:26
 */
@RestController
@RequestMapping("member/userlevel")
public class UserLevelController {
    @Autowired
    private UserLevelService userLevelService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:userlevel:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userLevelService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:userlevel:info")
    public R info(@PathVariable("id") Long id){
		UserLevelEntity userLevel = userLevelService.getById(id);

        return R.ok().put("userLevel", userLevel);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:userlevel:save")
    public R save(@RequestBody UserLevelEntity userLevel){
		userLevelService.save(userLevel);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:userlevel:update")
    public R update(@RequestBody UserLevelEntity userLevel){
		userLevelService.updateById(userLevel);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:userlevel:delete")
    public R delete(@RequestBody Long[] ids){
		userLevelService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
