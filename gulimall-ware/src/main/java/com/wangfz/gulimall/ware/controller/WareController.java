package com.wangfz.gulimall.ware.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wangfz.gulimall.ware.entity.WareEntity;
import com.wangfz.gulimall.ware.service.WareService;
import com.wangfz.common.utils.PageUtils;
import com.wangfz.common.utils.R;



/**
 * 仓库信息
 *
 * @author wangfz
 * @email 1071839341@qq.com
 * @date 2021-11-16 22:11:48
 */
@RestController
@RequestMapping("ware/ware")
public class WareController {
    @Autowired
    private WareService wareService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ware:ware:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wareService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("ware:ware:info")
    public R info(@PathVariable("id") Long id){
		WareEntity ware = wareService.getById(id);

        return R.ok().put("ware", ware);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ware:ware:save")
    public R save(@RequestBody WareEntity ware){
		wareService.save(ware);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ware:ware:update")
    public R update(@RequestBody WareEntity ware){
		wareService.updateById(ware);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ware:ware:delete")
    public R delete(@RequestBody Long[] ids){
		wareService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
