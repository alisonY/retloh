package com.retloh.model.commonVo;


/**
 * 前端控件分页参数接收VO
 *
 */
public class MyPaginationParms {
	
    private Integer page;
    
    private Integer rows;
    
    private String sort;
    
    private Boolean order;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public Boolean getOrder() {
		return order;
	}

	public void setOrder(Boolean order) {
		this.order = order;
	}
}
