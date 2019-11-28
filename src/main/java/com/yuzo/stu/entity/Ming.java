package com.yuzo.stu.entity;

public class Ming {

    private Integer mid;
    private String ming;

    @Override
    public String toString() {
        return "Ming{" +
                "mid=" + mid +
                ", ming='" + ming + '\'' +
                '}';
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMing() {
        return ming;
    }

    public void setMing(String ming) {
        this.ming = ming;
    }
}
