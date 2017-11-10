package com.zc.sys.common.model.jpa;

import java.util.List;

/**
 * 查询
 * 
 * @author zp
 * @version 0.0.1
 * @since 2017年6月28日
 */
public class SearchFilter {

	public static final String EMPTY = "empty";
	public static final String NULL = "null";
	public static final String EMPTY_AND_NULL = "emptyAndNull";
	public enum Operators {
		EQ, NOTEQ, LIKE, GT, LT, GTE, LTE, AND, OR, PROPERTY_EQ, PROPERTY_NOTEQ, PROPERTY_GT, PROPERTY_LT, DATE_LTE_TIMES, DATE_GT_TIMES
	}

	public Object fieldName;
	public Object value;
	public Operators operator;
	
	public Object rightFieldName;
	public Object rightValue;
	public Operators rightOperator;
	/**
	 * 秒数
	 */
	public long times;
	public List<SearchFilter> listFilters;

	public SearchFilter(Object fieldName, Operators operator, Object value) {
		this.fieldName = fieldName;
		this.value = value;
		this.operator = operator;
	}

	public SearchFilter(Object fieldName, Object value) {
		this(fieldName, Operators.EQ, value);
	}

	public SearchFilter(Object fieldName, Operators operator, Object value, long times) {
		this.fieldName = fieldName;
		this.value = value;
		this.operator = operator;
		this.times = times;
	}
	public SearchFilter(Object fieldName, Operators operator, Object value, Object rightFieldName, Operators rightOperator, Object rightValue) {
		this(fieldName, operator, value);
		this.rightFieldName = rightFieldName;
		this.rightValue = rightValue;
		this.rightOperator = rightOperator;
	}

	public static SearchFilter addOrFilter(SearchFilter... value) {
		SearchFilter orFilter = new SearchFilter(value[0], Operators.OR, value[1]);
		for (int i = 2; i < value.length; i++) {
			orFilter = new SearchFilter(orFilter, Operators.OR, value[i]);
		}
		return orFilter;
	}

	public static SearchFilter addOrParam(String key, Object... value) {
		SearchFilter orFilter = new SearchFilter(key, Operators.EQ, value[0]);
		for (int i = 1; i < value.length; i++) {
			orFilter = new SearchFilter(key, Operators.EQ, value[i]);
		}
		return orFilter;
	}

	public List<SearchFilter> getListFilters() {
		return listFilters;
	}

	public void setListFilters(List<SearchFilter> listFilters) {
		this.listFilters = listFilters;
	}
}
