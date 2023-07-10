package com.stuBio.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bio")
public class stuBio {
	@Id
	private String bioId;
	private String stuId;
	private String std;
	private String resultid;
	
	
	public stuBio(String bioId, String stuId, String std, String resultid) {
		super();
		this.bioId = bioId;
		this.stuId = stuId;
		this.std = std;
		this.resultid = resultid;
	}
	public stuBio() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBioId() {
		return bioId;
	}
	public void setBioId(String bioId) {
		this.bioId = bioId;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getResultid() {
		return resultid;
	}
	public void setResultid(String resultid) {
		this.resultid = resultid;
	}
	@Override
	public String toString() {
		return "stuBio [bioId=" + bioId + ", stuId=" + stuId + ", std=" + std + ", resultid=" + resultid + "]";
	}
	
	
	

}
