/**  
 * Copyright © 2016xiaomi. All rights reserved.
 *
 * @Title: ItemServiceImpl.java
 * @Prject: taotao-manager-service
 * @Package: com.taotao.service
 * @Description: TODO
 * @author: 小米  
 * @date: 2016年9月5日 下午5:41:59
 * @version: V1.0  
 */
package com.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.pojo.TbItemExample.Criteria;
import com.taotao.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private TbItemMapper tbItemMapper;

	/**
	 * @Title: findItemById
	 * @Description: 通过id查找商品
	 * @return
	 * @see com.taotao.service.ItemService#findItemById()
	 */
	@Override
	public TbItem findItemById(Long id) {
		// 根据查询条件查询
		// TbItemExample example = new TbItemExample();
		// Criteria criteria = example.createCriteria();
		// List<TbItem> list = criteria.andIdEqualTo(id);
		// TbItem item = null;
		// if(list != null && list.size() > 0){
		// item = list.get(0);
		// }
		TbItem item = tbItemMapper.selectByPrimaryKey(id);
		return item;
	}

	/**
	 * 商品列表查询
	 * <p>
	 * Title: getItemList
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param page
	 * @param rows
	 * @return
	 * @see com.taotao.service.ItemService#getItemList(long, long)
	 */
	@Override
	public EUDataGridResult getItemList(int page, int rows) {
		// 查询商品列表
		TbItemExample example = new TbItemExample();
		// 分页处理
		PageHelper.startPage(page, rows);
		List<TbItem> list = tbItemMapper.selectByExample(example);
		// 创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		// 取记录总条数
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;

	}
}