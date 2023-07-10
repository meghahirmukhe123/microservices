package com.House.entity;

public class owner {

	private String ownerID;
	private String houseId;
	private String ownerName;
	private String renterId;
	private renter Renter;
	public owner(String ownerID, String houseId, String ownerName, String renterId, renter renter) {
		super();
		this.ownerID = ownerID;
		this.houseId = houseId;
		this.ownerName = ownerName;
		this.renterId = renterId;
		Renter = renter;
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
	public renter getRenter() {
		return Renter;
	}
	public void setRenter(renter renter) {
		Renter = renter;
	}
	@Override
	public String toString() {
		return "owner [ownerID=" + ownerID + ", houseId=" + houseId + ", ownerName=" + ownerName + ", renterId="
				+ renterId + ", Renter=" + Renter + "]";
	}
	
	
	
}
