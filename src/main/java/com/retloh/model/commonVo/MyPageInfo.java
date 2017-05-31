package com.retloh.model.commonVo;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import com.github.pagehelper.Page;

/**
 * 返回参数包装
 *
 * @param <T>
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class MyPageInfo<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    //总记录数
    private String total;
    //总页数
    private String pages;
    //结果集
    private List<T> rows;

    public MyPageInfo() {
    }

    /**
     * 包装Page对象
     *
     * @param list
     */
    public MyPageInfo(List<T> list) {
        this(list, 8);
    }

    /**
     * 包装Page对象
     *
     * @param list          page结果
     * @param navigatePages 页码数量
     */
    public MyPageInfo(List<T> rows, int navigatePages) {
        if (rows instanceof Page) {
            Page page = (Page) rows;
            this.pages = String.valueOf(page.getPages());
            this.rows = page;
            this.total = String.valueOf(page.getTotal());
        } else if (rows instanceof Collection) {
            this.pages = "1";
            this.rows = rows;
            this.total = String.valueOf(rows.size());
        }
    }

    public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PageInfo{");
        sb.append("total=").append(total);
        sb.append(", pages=").append(pages);
        sb.append(", rows=").append(rows);
        sb.append('}');
        return sb.toString();
    }
}
