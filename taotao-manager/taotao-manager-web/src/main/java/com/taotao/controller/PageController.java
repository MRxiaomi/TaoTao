/**  
 * Copyright © 2016xiaomi. All rights reserved.
 *
 * @Title: PageController.java
 * @Prject: taotao-manager-web
 * @Package: com.taotao.controller
 * @Description: TODO
 * @author: 小米  
 * @date: 2016年9月5日 下午8:52:50
 * @version: V1.0  
 */
package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: PageController
 * @Description: 页面跳转 打开首页 
 * @author: 小米
 * @date: 2016年9月5日 下午8:52:50
 */
@Controller
public class PageController {
	//首页展示
	@RequestMapping("/")
	public String showIndex(){
		return "index";
	}
	//展示其他页面
	@RequestMapping("/{page}")
	public String showIndex(@PathVariable String page){
		return page;
	}
	
	
}
