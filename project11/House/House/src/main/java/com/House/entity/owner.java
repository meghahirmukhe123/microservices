package com.House.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class owner {

	private String ownerID;
	private String houseId;
	private String ownerName;
	private String renterId;
	private renter Renter;
	
	
	
}
