package com.yuzo.stu.entity;


import java.util.Date;

public class Exam {
    private String exmId;

    private String exmName;

    private Date exmDate;

    private Integer exmTotal;
    
    

    @Override
	public String toString() {
		return "Exam [exmId=" + exmId + ", exmName=" + exmName + ", exmDate=" + exmDate + ", exmTotal=" + exmTotal
				+ "]";
	}

	public String getExmId() {
        return exmId;
    }

    public void setExmId(String exmId) {
        this.exmId = exmId == null ? null : exmId.trim();
    }

    public String getExmName() {
        return exmName;
    }

    public void setExmName(String exmName) {
        this.exmName = exmName == null ? null : exmName.trim();
    }

    public Date getExmDate() {
        return exmDate;
    }

    public void setExmDate(Date exmDate) {
        this.exmDate = exmDate;
    }

    public Integer getExmTotal() {
        return exmTotal;
    }

    public void setExmTotal(Integer exmTotal) {
        this.exmTotal = exmTotal;
    }
}