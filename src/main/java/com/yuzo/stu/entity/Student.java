package com.yuzo.stu.entity;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Student {
	
    private String stuId;

    private String ctId;

    private String stuName;

    private Integer stuInAge;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date stuBirth;

    private Double stuWeight;

    private String stuSex;
    
    private String ctName;
    
    private String stuSexName;

    private Date stuInTime;


    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", ctId='" + ctId + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuInAge=" + stuInAge +
                ", stuBirth=" + stuBirth +
                ", stuWeight=" + stuWeight +
                ", stuSex='" + stuSex + '\'' +
                ", ctName='" + ctName + '\'' +
                ", stuSexName='" + stuSexName + '\'' +
                ", stuInTime=" + stuInTime +
                '}';
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    public String getCtId() {
        return ctId;
    }

    public void setCtId(String ctId) {
        this.ctId = ctId == null ? null : ctId.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public Integer getStuInAge() {
        return stuInAge;
    }

    public void setStuInAge(Integer stuInAge) {
        this.stuInAge = stuInAge;
    }

    public Date getStuBirth() {
        return stuBirth;
    }

    public void setStuBirth(Date stuBirth) {
        this.stuBirth = stuBirth;
    }

    public Double getStuWeight() {
        return stuWeight;
    }

    public void setStuWeight(Double stuWeight) {
        this.stuWeight = stuWeight;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

	public String getCtName() {
		return ctName;
	}

	public void setCtName(String ctName) {
		this.ctName = ctName;
	}

	public String getStuSexName() {
		return stuSexName;
	}

	public void setStuSexName(String stuSexName) {
		this.stuSexName = stuSexName;
	}

    public Date getStuInTime() {
        return stuInTime;
    }

    public void setStuInTime(Date stuInTime) {
        this.stuInTime = stuInTime;
    }
}