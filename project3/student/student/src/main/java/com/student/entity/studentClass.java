package com.student.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class studentClass {
	@Id
	private String stuId;
	private String fname;
	private String lname;
	private long fees;
	
	@Transient
	private List<stureport> report=new ArrayList<>();

	public studentClass(String stuId, String fname, String lname, long fees, List<stureport> report) {
		super();
		this.stuId = stuId;
		this.fname = fname;
		this.lname = lname;
		this.fees = fees;
		this.report = report;
	}

	public studentClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public long getFees() {
		return fees;
	}

	public void setFees(long fees) {
		this.fees = fees;
	}

	public List<stureport> getReport() {
		return report;
	}

	public void setReport(List<stureport> report) {
		this.report = report;
	}

	@Override
	public String toString() {
		return "studentClass [stuId=" + stuId + ", fname=" + fname + ", lname=" + lname + ", fees=" + fees + "]";
	}
	
	
}
