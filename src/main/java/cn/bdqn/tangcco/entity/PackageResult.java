package cn.bdqn.tangcco.entity;

/**
 * Created by Administrator on 2017/5/20.
 */
public class PackageResult {
    private int pageNumber;//当前页
    private int pageSize;//每页线束对少条
    private int totalPosts;//总记录数
    private int totalpages;//总页数

    public PackageResult() {
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPosts() {
        return totalPosts;
    }

    public void setTotalPosts(int totalPosts) {
        this.totalPosts = totalPosts;
    }

    public int getTotalpages() {
        return totalpages;
    }

    public void setTotalpages(int totalpages) {
        this.totalpages = totalpages;
    }

    @Override
    public String toString() {
        return "PackageResult{" +
                "pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", totalPosts=" + totalPosts +
                ", totalpages=" + totalpages +
                '}';
    }
}
