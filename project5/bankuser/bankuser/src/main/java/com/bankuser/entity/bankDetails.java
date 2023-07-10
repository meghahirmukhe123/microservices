package com.bankuser.entity;

public class bankDetails {

	private String bankId;
	private String uId;
	private String branchname;
	private String useracid;
	
	private userAccount UserAccount;

	public bankDetails(String bankId, String uId, String branchname, String useracid, userAccount userAccount) {
		super();
		this.bankId = bankId;
		this.uId = uId;
		this.branchname = branchname;
		this.useracid = useracid;
		UserAccount = userAccount;
	}

	public bankDetails() {
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

	public userAccount getUserAccount() {
		return UserAccount;
	}

	public void setUserAccount(userAccount userAccount) {
		UserAccount = userAccount;
	}

	@Override
	public String toString() {
		return "bankDetails [bankId=" + bankId + ", uId=" + uId + ", branchname=" + branchname + ", useracid="
				+ useracid + ", UserAccount=" + UserAccount + "]";
	}
	
	
}
