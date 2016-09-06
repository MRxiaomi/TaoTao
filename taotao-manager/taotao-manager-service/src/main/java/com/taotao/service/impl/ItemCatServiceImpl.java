/**  
 * Copyright © 2016xiaomi. All rights reserved.
 *
 * @Title: ItemCatServiceImpl.java
 * @Prject: taotao-manager-service
 * @Package: com.taotao.service.impl
 * @Description: TODO
 * @author: 小米  
 * @date: 2016年9月5日 下午10:52:18
 * @version: V1.0  
 */
package com.taotao.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.EUTreeNode;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.pojo.TbItemCatExample.Criteria;
import com.taotao.service.ItemCatService;

/**
 * @ClassName: ItemCatServiceImpl
 * @Description: TODO
 * @author: 小米
 * @date: 2016年9月5日 下午10:52:18
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {
	@Autowired
	private TbItemCatMapper itemCatMapper;

	/**
	 * @Title: getItemCatList
	 * @Description: TODO
	 * @param parentId
	 * @return
	 * @see com.taotao.service.ItemCatService#getItemCatList(long)
	 */
	@Override
	public List<EUTreeNode> getItemCatList(long parentId) {

		// 根据parentId查询分类列表
		TbItemCatExample example = new TbItemCatExample();
		// 设置查询条件
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		// 执行查询
		List<TbItemCat> list = itemCatMapper.selectByExample(example);
		// 转换成EasyUITreeNode列表
		List<EUTreeNode> resultList = new ArrayList<>();
		for (TbItemCat tbItemCat : list) {
			// 创建一个节点对象
			EUTreeNode node = new EUTreeNode();
			node.setId(tbItemCat.getId());
			node.setText(tbItemCat.getName());
			node.setState(tbItemCat.getIsParent() ? "closed" : "open");
			// 添加到列表中
			resultList.add(node);
		}
		return resultList;
	}

}
