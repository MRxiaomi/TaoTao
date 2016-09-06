/**  
 * Copyright © 2016xiaomi. All rights reserved.
 *
 * @Title: ItemService.java
 * @Prject: taotao-manager-service
 * @Package: com.taotao.service
 * @Description: TODO
 * @author: 小米  
 * @date: 2016年9月5日 下午5:41:03
 * @version: V1.0  
 */
package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.EUTreeNode;
import com.taotao.pojo.TbItem;

/**
 * @ClassName: ItemService
 * @Description: TODO
 * @author: 小米
 * @date: 2016年9月5日 下午5:41:03
 */
public interface ItemCatService {
	public List<EUTreeNode> getItemCatList(long parentId);
}
