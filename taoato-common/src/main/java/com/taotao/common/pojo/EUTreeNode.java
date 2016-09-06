/**  
 * Copyright © 2016xiaomi. All rights reserved.
 *
 * @Title: EUDataGridResult.java
 * @Prject: taoato-common
 * @Package: com.taotao.common.pojo
 * @Description: TODO
 * @author: 小米  
 * @date: 2016年9月5日 下午10:05:24
 * @version: V1.0  
 */
package com.taotao.common.pojo;

import java.util.List;

/**
 * @ClassName: EUTreeNode
 * @Description: TODO
 * @author: 小米
 * @date: 2016年9月5日 下午10:05:24
 */
public class EUTreeNode {
	private long id;
	private String text;
	private String state;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getText() {
		return text;

	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
