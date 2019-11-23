package com.yuzo.stu.entity;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ClassTeam {
    private String ctId;

    private String ctName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ctBeginDate;

    private Integer ctCount;
    
    

    @Override
	public String toString() {
		return "ClassTeam [ctId=" + ctId + ", ctName=" + ctName + ", ctBeginDate=" + ctBeginDate + ", ctCount="
				+ ctCount + "]";
	}

	public String getCtId() {
        return ctId;
    }

    public void setCtId(String ctId) {
        this.ctId = ctId == null ? null : ctId.trim();
    }

    public String getCtName() {
        return ctName;
    }

    public void setCtName(String ctName) {
        this.ctName = ctName == null ? null : ctName.trim();
    }

    public Date getCtBeginDate() {
        return ctBeginDate;
    }

    public void setCtBeginDate(Date ctBeginDate) {
        this.ctBeginDate = ctBeginDate;
    }

    public Integer getCtCount() {
        return ctCount;
    }

    public void setCtCount(Integer ctCount) {
        this.ctCount = ctCount;
    }
}