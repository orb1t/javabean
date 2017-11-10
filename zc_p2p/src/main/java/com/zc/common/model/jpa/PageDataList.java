package com.zc.common.model.jpa;

import java.util.List;


/**
 * 分页
 * 
 * @author zp
 * @version 0.0.1
 * @since 2017年6月28日
 */
public class PageDataList<T> {

	private Page page;

	private List<T> list;

	private int type;

	public PageDataList() {
		super();
	}

	public PageDataList(Page page, List<T> list) {
		super();
		this.page = page;
		this.list = list;
	}

	public PageDataList(Page page, List<T> list, int type) {
		super();
		this.page = page;
		this.list = list;
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
