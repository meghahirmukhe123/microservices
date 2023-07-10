package com.Owner.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "owner")
public class owner {

	@Id
	private String ownerID;
	private String houseId;
	private String ownerName;
	private String renterId;
	
	
	public owner(String ownerID, String houseId, String ownerName, String renterId) {
		super();
		this.ownerID = ownerID;
		this.houseId = houseId;
		this.ownerName = ownerName;
		this.renterId = renterId;
		
	}

	public owner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(String ownerID) {
		this.ownerID = ownerID;
	}

	public String getHouseId() {
		return houseId;
	}

	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getRenterId() {
		return renterId;
	}

	public void setRenterId(String renterId) {
		this.renterId = renterId;
	}

	

	@Override
	public String toString() {
		return "owner [ownerID=" + ownerID + ", houseId=" + houseId + ", ownerName=" + ownerName + "]";
	}

	


	
	
}
