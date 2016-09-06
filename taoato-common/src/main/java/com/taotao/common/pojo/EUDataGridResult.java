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
 * @ClassName: EUDataGridResult
 * @Description: TODO
 * @author: 小米
 * @date: 2016年9月5日 下午10:05:24
 */
public class EUDataGridResult {
	private long total;
	private List<?> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
}
