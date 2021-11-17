package com.wangfz.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 整合mybatis-plus
*   1 导入依赖
*   2 配置
*       配置数据源：
*           导入数据库的驱动
*           在application.yaml文件里面配置数据源相关信息
*       配置mybatis-plus：
*           使用@MapperScan
*           告诉mybatis-plus sql映射文件在哪里
* */

@MapperScan("com.wangfz.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
