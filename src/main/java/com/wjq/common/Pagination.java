package com.wjq.common;

/**
 * <p>Description : springboot
 * <p>Date : 2018\3\15 0015 14:07
 * <p>@author : wjq
 */
public abstract class Pagination implements Pageable {
    private static final long serialVersionUID = 6770910398432661850L;
    public static final int DEFAULT_PAGE_SIZE = 20;
    private int totalCount = 0;//总数
    private int pageSize = DEFAULT_PAGE_SIZE;//每页默认显示条数
    private int pageNo = 1;//当前页
    private String orderStr;//排序字段

    public Pagination() {
    }

    public Pagination(int pageNo, int pageSize) {
        if (pageSize <= 0) {
            this.pageSize = 20;
        } else {
            this.pageSize = pageSize;
        }

        if (pageNo <= 0) {
            this.pageNo = 1;
        } else {
            this.pageNo = pageNo;
        }

    }

    public void adjust() {
        if (this.totalCount <= 0) {
            this.totalCount = 0;
        }

        if (this.pageSize <= 0) {
            this.pageSize = 20;
        }

        if ((this.pageNo - 1) * this.pageSize >= this.totalCount) {
            this.pageNo = this.totalCount / this.pageSize;
        }

        if (this.pageNo <= 0) {
            this.pageNo = 1;
        }

    }

    public int getPageNo() {
        return this.pageNo;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public int getTotalPage() {
        int totalPage = this.totalCount / this.pageSize;
        if (this.totalCount % this.pageSize != 0 || totalPage == 0) {
            ++totalPage;
        }

        return totalPage;
    }

    public boolean isFirstPage() {
        return this.pageNo <= 1;
    }

    public boolean isLastPage() {
        return this.pageNo >= this.getTotalPage();
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public String getOrderStr() {
        return this.orderStr;
    }

    public void setOrderStr(String orderStr) {
        this.orderStr = orderStr;
    }

    public int getOffset() {
        return this.getBeginIndex();
    }

    public int getLimit() {
        return this.getPageSize();
    }

    public int getBeginIndex() {
        return this.pageNo > 0 ? this.pageSize * (this.pageNo - 1) : 0;
    }

    public int getEndIndex() {
        return this.pageNo > 0 ? Math.min(this.pageSize * this.pageNo, this.totalCount) : 0;
    }
}
