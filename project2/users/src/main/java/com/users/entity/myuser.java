package com.users.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "myuser")
public class myuser {

	@Id
	private String userId;
	private String name;
	private String city;
	private String email;
	
	
	@Transient
	private List<Rating> ratings=new ArrayList<>();


	public myuser(String userId, String name, String city, String email, List<Rating> ratings) {
		super();
		this.userId = userId;
		this.name = name;
		this.city = city;
		this.email = email;
		this.ratings = ratings;
	}


	public myuser() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<Rating> getRatings() {
		return ratings;
	}


	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}


	@Override
	public String toString() {
		return "myuser [userId=" + userId + ", name=" + name + ", city=" + city + ", email=" + email + ", ratings="
				+ ratings + "]";
	}
	
	
	
	

	
	
	
}
