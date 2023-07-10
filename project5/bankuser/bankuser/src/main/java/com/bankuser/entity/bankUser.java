package com.bankuser.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bankuser")
public class bankUser {
	@Id
	private String uId;
	private String fname;
	private String lname;
	
	@Transient
	private List<bankDetails> BankDetails= new ArrayList<>();

	public bankUser(String uId, String fname, String lname, List<bankDetails> bankDetails) {
		super();
		this.uId = uId;
		this.fname = fname;
		this.lname = lname;
		BankDetails = bankDetails;
	}

	public bankUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
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

	public List<bankDetails> getBankDetails() {
		return BankDetails;
	}

	public void setBankDetails(List<bankDetails> bankDetails) {
		BankDetails = bankDetails;
	}

	@Override
	public String toString() {
		return "bankuser [uId=" + uId + ", fname=" + fname + ", lname=" + lname + ", BankDetails=" + BankDetails + "]";
	}
	
	

}
