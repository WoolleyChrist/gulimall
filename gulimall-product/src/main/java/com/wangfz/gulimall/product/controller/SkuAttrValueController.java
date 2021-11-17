package com.wangfz.gulimall.product.controller;

import java.util.Arrays;
import java.util.Map;

import com.wangfz.common.utils.PageUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wangfz.gulimall.product.entity.SkuAttrValueEntity;
import com.wangfz.gulimall.product.service.SkuAttrValueService;
import com.wangfz.common.utils.R;



/**
 * sku销售属性&值
 *
 * @author wangfz
 * @email 1071839341@gmail.com
 * @date 2021-11-15 21:20:07
 */
@RestController
@RequestMapping("product/skuattrvalue")
public class SkuAttrValueController {
    @Autowired
    private SkuAttrValueService skuAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("product:skuattrvalue:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = skuAttrValueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("product:skuattrvalue:info")
    public R info(@PathVariable("id") Long id){
		SkuAttrValueEntity skuAttrValue = skuAttrValueService.getById(id);

        return R.ok().put("skuAttrValue", skuAttrValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("product:skuattrvalue:save")
    public R save(@RequestBody SkuAttrValueEntity skuAttrValue){
		skuAttrValueService.save(skuAttrValue);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("product:skuattrvalue:update")
    public R update(@RequestBody SkuAttrValueEntity skuAttrValue){
		skuAttrValueService.updateById(skuAttrValue);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("product:skuattrvalue:delete")
    public R delete(@RequestBody Long[] ids){
		skuAttrValueService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
