/**  
 * Copyright © 2016xiaomi. All rights reserved.
 *
 * @Title: ItemController.java
 * @Prject: taotao-manager-web
 * @Package: com.taotao.controller
 * @Description: TODO
 * @author: 小米  
 * @date: 2016年9月5日 下午5:54:10
 * @version: V1.0  
 */
package com.taotao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;

/**
 * @ClassName: ItemController
 * @Description: TODO
 * @author: 小米
 * @date: 2016年9月5日 下午5:54:10
 */
@Controller
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/{itemId}")
	@ResponseBody
	private TbItem getItemById(@PathVariable Long itemId) {
		TbItem item = itemService.findItemById(itemId);
		return item;
	}
	@RequestMapping("/list")
	public @ResponseBody EUDataGridResult getItemList(Integer page,Integer rows){
		EUDataGridResult euDataGridResult = itemService.getItemList(page, rows);
		return euDataGridResult;
	}
}



