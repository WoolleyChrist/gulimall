package com.wangfz.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wangfz.gulimall.product.entity.BrandEntity;
import com.wangfz.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setId(1L);
//        brandEntity.setRemark("华为");
//        brandEntity.setName("华为");
//        brandService.updateById(brandEntity);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("id",1L));
        list.forEach(System.out::println);
    }

}
