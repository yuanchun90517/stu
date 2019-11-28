package com.yuzo.stu.entity;

public class Xing {

    private Integer xid;
    private String xing;

    @Override
    public String toString() {
        return "Xing{" +
                "xid=" + xid +
                ", xing='" + xing + '\'' +
                '}';
    }

    public Integer getXid() {
        return xid;
    }

    public String getXing() {
        return xing;
    }

    public void setXid(Integer xid) {
        this.xid = xid;
    }

    public void setXing(String xing) {
        this.xing = xing;
    }
}
