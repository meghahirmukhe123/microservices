package com.student.entity;



public class stuBio {
	
	private String bioId;
	private String stuId;
	private String std;
	private String resultid;
	
	
	private stumarks Stumarks;


	public stuBio(String bioId, String stuId, String std, String resultid, stumarks stumarks) {
		super();
		this.bioId = bioId;
		this.stuId = stuId;
		this.std = std;
		this.resultid = resultid;
		Stumarks = stumarks;
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


	public stumarks getStumarks() {
		return Stumarks;
	}


	public void setStumarks(stumarks stumarks) {
		Stumarks = stumarks;
	}


	@Override
	public String toString() {
		return "stuBio [bioId=" + bioId + ", stuId=" + stuId + ", std=" + std + ", resultid=" + resultid + ", Stumarks="
				+ Stumarks + "]";
	}
	

	
}
