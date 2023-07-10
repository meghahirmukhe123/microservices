package com.student.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "stu")
public class stu {
	@Id
	private String stuId;
	private String stuname;
	private long fees;
	
	@Transient
	private List<stuBio> StuBio=new ArrayList<>();

	public stu(String stuId, String stuname, long fees, List<stuBio> stuBio) {
		super();
		this.stuId = stuId;
		this.stuname = stuname;
		this.fees = fees;
		StuBio = stuBio;
	}

	public stu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public long getFees() {
		return fees;
	}

	public void setFees(long fees) {
		this.fees = fees;
	}

	public List<stuBio> getStuBio() {
		return StuBio;
	}

	public void setStuBio(List<stuBio> stuBio) {
		StuBio = stuBio;
	}

	@Override
	public String toString() {
		return "stu [stuId=" + stuId + ", stuname=" + stuname + ", fees=" + fees + ", StuBio=" + StuBio + "]";
	}
	
	
	
	
}
