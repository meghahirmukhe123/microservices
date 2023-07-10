package com.House.entity;


import java.beans.Transient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Document(collection = "house")
public class house {
	@Id
	private String houseId;
	private String lenNum;
	private long rent;
	
	@org.springframework.data.annotation.Transient
	private List<owner> Owner= new ArrayList<>();



	
	

}
