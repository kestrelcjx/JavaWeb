package com.kestrelcjx.common.common;

/**
 * 查询对象基类
 */
public class BaseQuery {
    /**
     * 页码（默认为1）
     */
    private Integer page = 1;
    /**
     * 每页数（默认为20）
     */
    private Integer limit = 20;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
