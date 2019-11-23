package com.yuzo.stu.entity;



public class StuExam {
    private String stuExmId;

    private String stuId;

    private String exmId;

    private Integer stuExmScore;
    
    
    private String stuName;
    
    private String exmName;
    
    
    

    @Override
	public String toString() {
		return "StuExam [stuExmId=" + stuExmId + ", stuId=" + stuId + ", exmId=" + exmId + ", stuExmScore="
				+ stuExmScore + ", stuName=" + stuName + ", exmName=" + exmName + "]";
	}

	public String getStuExmId() {
        return stuExmId;
    }

    public void setStuExmId(String stuExmId) {
        this.stuExmId = stuExmId == null ? null : stuExmId.trim();
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    public String getExmId() {
        return exmId;
    }

    public void setExmId(String exmId) {
        this.exmId = exmId == null ? null : exmId.trim();
    }

    public Integer getStuExmScore() {
        return stuExmScore;
    }

    public void setStuExmScore(Integer stuExmScore) {
        this.stuExmScore = stuExmScore;
    }

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getExmName() {
		return exmName;
	}

	public void setExmName(String exmName) {
		this.exmName = exmName;
	}
    
    
}