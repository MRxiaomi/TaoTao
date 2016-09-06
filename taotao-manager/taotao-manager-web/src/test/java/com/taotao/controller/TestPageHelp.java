/**  
 * Copyright © 2016xiaomi. All rights reserved.
 *
 * @Title: TestPageHelp.java
 * @Prject: taotao-manager-web
 * @Package: com.taotao.controller
 * @Description: TODO
 * @author: 小米  
 * @date: 2016年9月5日 下午9:57:33
 * @version: V1.0  
 */
package com.taotao.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;

/**
 * @ClassName: TestPageHelp
 * @Description: TODO
 * @author: 小米
 * @date: 2016年9月5日 下午9:57:33
 */
public class TestPageHelp {
	@Test
	public void testPageHelper() {
		//创建一个spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		//从spring容器中获得Mapper的代理对象
		TbItemMapper mapper = applicationContext.getBean(TbItemMapper.class);
		//执行查询，并分页
		TbItemExample example = new TbItemExample();
		//分页处理
		PageHelper.startPage(4, 10);
		List<TbItem> list = mapper.selectByExample(example);
		//取商品列表
		for (TbItem tbItem : list) {
			System.out.println(tbItem.getTitle());
		}
		//取分页信息
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		long total = pageInfo.getTotal();
		System.out.println("共有商品："+ total);
		
	}

}
