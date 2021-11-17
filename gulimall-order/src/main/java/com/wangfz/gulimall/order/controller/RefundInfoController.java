package com.wangfz.gulimall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wangfz.gulimall.order.entity.RefundInfoEntity;
import com.wangfz.gulimall.order.service.RefundInfoService;
import com.wangfz.common.utils.PageUtils;
import com.wangfz.common.utils.R;



/**
 * 退款信息
 *
 * @author wangfz
 * @email 1071839341@qq.com
 * @date 2021-11-16 22:06:50
 */
@RestController
@RequestMapping("order/refundinfo")
public class RefundInfoController {
    @Autowired
    private RefundInfoService refundInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("order:refundinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = refundInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("order:refundinfo:info")
    public R info(@PathVariable("id") Long id){
		RefundInfoEntity refundInfo = refundInfoService.getById(id);

        return R.ok().put("refundInfo", refundInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("order:refundinfo:save")
    public R save(@RequestBody RefundInfoEntity refundInfo){
		refundInfoService.save(refundInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("order:refundinfo:update")
    public R update(@RequestBody RefundInfoEntity refundInfo){
		refundInfoService.updateById(refundInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("order:refundinfo:delete")
    public R delete(@RequestBody Long[] ids){
		refundInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
