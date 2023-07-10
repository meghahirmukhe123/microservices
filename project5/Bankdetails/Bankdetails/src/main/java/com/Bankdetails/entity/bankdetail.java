package com.Bankdetails.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bankdetail")
public class bankdetail {
	
	@Id
	private String bankId;
	private String uId;
	private String branchname;
	private String useracid;
	public bankdetail(String bankId, String uId, String branchname, String useracid) {
		super();
		this.bankId = bankId;
		this.uId = uId;
		this.branchname = branchname;
		this.useracid = useracid;
	}
	public bankdetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBankId() {
		return bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public String getUseracid() {
		return useracid;
	}
	public void setUseracid(String useracid) {
		this.useracid = useracid;
	}
	@Override
	public String toString() {
		return "bankdetail [bankId=" + bankId + ", uId=" + uId + ", branchname=" + branchname + ", useracid=" + useracid
				+ "]";
	}
	
	
	

}
