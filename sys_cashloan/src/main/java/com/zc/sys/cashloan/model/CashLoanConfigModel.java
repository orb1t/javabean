package com.zc.sys.cashloan.model;
import org.springframework.beans.BeanUtils;

import com.zc.sys.common.model.jpa.Page;
import com.zc.sys.cashloan.entity.CashLoanConfig;
/**
 * 现金贷产品配置
 * @author zp
 * @version 2.0.0.0
 * @since 2017年11月22日
 */
public class CashLoanConfigModel extends CashLoanConfig {
	/** 序列号 **/
	private static final long serialVersionUID = 1L;

	/** 当前页码 **/
	private int pageNo;
	/** 每页数据条数 **/
	private int pageSize = Page.ROWS;
	/** 条件查询 **/
	private String searchName;

	/**
	 * 实体转换model
	 */
	public static CashLoanConfigModel instance(CashLoanConfig cashLoanConfig) {
		CashLoanConfigModel cashLoanConfigModel = new CashLoanConfigModel();
		BeanUtils.copyProperties(cashLoanConfig, cashLoanConfigModel);
		return cashLoanConfigModel;
	}

	/**
	 * model转换实体
	 */
	public CashLoanConfig prototype() {
		CashLoanConfig cashLoanConfig = new CashLoanConfig();
		BeanUtils.copyProperties(this, cashLoanConfig);
		return cashLoanConfig;
	}

	/** 获取【当前页码】 **/
	public int getPageNo() {
		return pageNo;
	}

	/** 设置【当前页码】 **/
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	/** 获取【每页数据条数】 **/
	public int getPageSize() {
		return pageSize;
	}

	/** 设置【每页数据条数】 **/
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/** 获取【条件查询】 **/
	public String getSearchName() {
		return searchName;
	}

	/** 设置【条件查询】 **/
	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

}