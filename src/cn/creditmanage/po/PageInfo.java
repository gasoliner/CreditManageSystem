package cn.creditmanage.po;

/**
 * Created by wanzhenghang on 2017/5/13.
 */
public class PageInfo {

    int page;

    int size;

    int start;

    @Override
    public String toString() {
        return "PageInfo{" +
                "page=" + page +
                ", size=" + size +
                ", start=" + start +
                '}';
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }
}
