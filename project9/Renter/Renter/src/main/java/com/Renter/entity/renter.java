package com.Renter.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "renter")
public class renter {
	@Id
	private String renterId;
	private String renterName;
	private String doj;
	public renter(String renterId, String renterName, String doj) {
		super();
		this.renterId = renterId;
		this.renterName = renterName;
		this.doj = doj;
	}
	public renter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getRenterId() {
		return renterId;
	}
	public void setRenterId(String renterId) {
		this.renterId = renterId;
	}
	public String getRenterName() {
		return renterName;
	}
	public void setRenterName(String renterName) {
		this.renterName = renterName;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "renter [renterId=" + renterId + ", renterName=" + renterName + ", doj=" + doj + "]";
	}
	

}
