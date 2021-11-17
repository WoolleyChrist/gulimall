/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.renren;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 在启动renren-application之前要删除定时任务数据库里面的所有数据
* */
@SpringBootApplication
public class RenrenApplication {

	public static void main(String[] args) {
		SpringApplication.run(RenrenApplication.class, args);
	}

}