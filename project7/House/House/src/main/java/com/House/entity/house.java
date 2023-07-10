package com.House.entity;


import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "house")
public class house {
	@Id
	private String houseId;
	private String lenNum;
	private long rent;
	
	@org.springframework.data.annotation.Transient
	private List<owner> Owner= new ArrayList<>();

	public house(String houseId, String lenNum, long rent, List<owner> owner) {
		super();
		this.houseId = houseId;
		this.lenNum = lenNum;
		this.rent = rent;
		Owner = owner;
	}

	public house() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getHouseId() {
		return houseId;
	}

	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}

	public String getLenNum() {
		return lenNum;
	}

	public void setLenNum(String lenNum) {
		this.lenNum = lenNum;
	}

	public long getRent() {
		return rent;
	}

	public void setRent(long rent) {
		this.rent = rent;
	}

	public List<owner> getOwner() {
		return Owner;
	}

	public void setOwner(List<owner> owner) {
		Owner = owner;
	}

	@Override
	public String toString() {
		return "house [houseId=" + houseId + ", lenNum=" + lenNum + ", rent=" + rent + ", Owner=" + Owner + "]";
	}
	
	

}
