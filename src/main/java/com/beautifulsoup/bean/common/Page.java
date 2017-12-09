package com.beautifulsoup.bean.common;

/**
 * Created by BeautifulSoup on 2017/12/9.
 */
public class Page {
    private int records;
    private int pageNum;
    private int pageSize;
    private int totalPage;

    public Page() {
    }

    public Page(int records, int pageNum, int pageSize, int totalPage) {
        this.records = records;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalPage = totalPage;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
