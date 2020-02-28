package com.yfy.dianping.request;

/**
 * @author youfy
 * @date 2020-02-28 20:15分
 */
public class PageQuery {

    private Integer page =1;

    private Integer size =20;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
