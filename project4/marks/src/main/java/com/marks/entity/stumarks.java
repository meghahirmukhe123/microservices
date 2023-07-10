package com.marks.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "stumarks")
public class stumarks {
	@Id
	private String resultId;
	private int english;
	private int science;
	private int history;
	public stumarks(String resultId, int english, int science, int history) {
		super();
		this.resultId = resultId;
		this.english = english;
		this.science = science;
		this.history = history;
	}
	public stumarks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getResultId() {
		return resultId;
	}
	public void setResultId(String resultId) {
		this.resultId = resultId;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getHistory() {
		return history;
	}
	public void setHistory(int history) {
		this.history = history;
	}
	@Override
	public String toString() {
		return "stumarks [resultId=" + resultId + ", english=" + english + ", science=" + science + ", history="
				+ history + "]";
	}
	
	
	

}
