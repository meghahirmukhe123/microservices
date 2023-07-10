package com.bankuser.entity;

public class userAccount {

	private String useracid;
	private String uId;
	private String bankId;
	private String lockerId;
	private String hasCheck;
	private String userBankNum;
	
	private money Money;

	public userAccount(String useracid, String uId, String bankId, String lockerId, String hasCheck, String userBankNum,
			money money) {
		super();
		this.useracid = useracid;
		this.uId = uId;
		this.bankId = bankId;
		this.lockerId = lockerId;
		this.hasCheck = hasCheck;
		this.userBankNum = userBankNum;
		Money = money;
	}

	public userAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUseracid() {
		return useracid;
	}

	public void setUseracid(String useracid) {
		this.useracid = useracid;
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getLockerId() {
		return lockerId;
	}

	public void setLockerId(String lockerId) {
		this.lockerId = lockerId;
	}

	public String getHasCheck() {
		return hasCheck;
	}

	public void setHasCheck(String hasCheck) {
		this.hasCheck = hasCheck;
	}

	public String getUserBankNum() {
		return userBankNum;
	}

	public void setUserBankNum(String userBankNum) {
		this.userBankNum = userBankNum;
	}

	public money getMoney() {
		return Money;
	}

	public void setMoney(money money) {
		Money = money;
	}

	@Override
	public String toString() {
		return "userAccount [useracid=" + useracid + ", uId=" + uId + ", bankId=" + bankId + ", lockerId=" + lockerId
				+ ", hasCheck=" + hasCheck + ", userBankNum=" + userBankNum + ", Money=" + Money + "]";
	}
	
	
	
}
