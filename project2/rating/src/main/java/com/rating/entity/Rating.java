package com.rating.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "myrating")
public class Rating {
	
	@Id
	private String ratingid;
	private String userId;
	private int rating;
	private String feedback;
	
	//constructor using feilds
	public Rating(String ratingid, String userId, int rating, String feedback) {
		super();
		this.ratingid = ratingid;
		this.userId = userId;
		this.rating = rating;
		this.feedback = feedback;
	}
	
	//no argument constructor
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getters setters
	public String getRatingid() {
		return ratingid;
	}
	public void setRatingid(String ratingid) {
		this.ratingid = ratingid;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	//to string method
	@Override
	public String toString() {
		return "Rating [ratingid=" + ratingid + ", userId=" + userId + ", rating=" + rating + ", feedback=" + feedback
				+ "]";
	}
	
	

}
