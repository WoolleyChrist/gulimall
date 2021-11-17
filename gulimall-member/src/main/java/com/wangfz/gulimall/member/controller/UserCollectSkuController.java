package com.wangfz.gulimall.member.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wangfz.gulimall.member.entity.UserCollectSkuEntity;
import com.wangfz.gulimall.member.service.UserCollectSkuService;
import com.wangfz.common.utils.PageUtils;
import com.wangfz.common.utils.R;



/**
 * 关注商品表
 *
 * @author wangfz
 * @email 1071839341@qq.com
 * @date 2021-11-16 22:00:26
 */
@RestController
@RequestMapping("member/usercollectsku")
public class UserCollectSkuController {
    @Autowired
    private UserCollectSkuService userCollectSkuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:usercollectsku:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userCollectSkuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:usercollectsku:info")
    public R info(@PathVariable("id") Long id){
		UserCollectSkuEntity userCollectSku = userCollectSkuService.getById(id);

        return R.ok().put("userCollectSku", userCollectSku);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:usercollectsku:save")
    public R save(@RequestBody UserCollectSkuEntity userCollectSku){
		userCollectSkuService.save(userCollectSku);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:usercollectsku:update")
    public R update(@RequestBody UserCollectSkuEntity userCollectSku){
		userCollectSkuService.updateById(userCollectSku);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:usercollectsku:delete")
    public R delete(@RequestBody Long[] ids){
		userCollectSkuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
