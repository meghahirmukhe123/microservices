package com.stuReport.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "stureport")
public class stureport {
	@Id
	private String reportId;
	private String stuId;
	private String grade;
	private String result;
	public stureport(String reportId, String stuId, String grade, String result) {
		super();
		this.reportId = reportId;
		this.stuId = stuId;
		this.grade = grade;
		this.result = result;
	}
	public stureport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "stureport [reportId=" + reportId + ", stuId=" + stuId + ", grade=" + grade + ", result=" + result + "]";
	}
	
	
}
