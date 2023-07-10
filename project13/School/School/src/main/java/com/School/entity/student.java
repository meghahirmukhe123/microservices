package com.School.entity;

import java.util.ArrayList;
import java.util.List;

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
@ToString
@Builder
public class student {
	
	private String stuId;
	private String schoolId;
	private String teachegrpId;
	private String resultId;
	private String name;
	
	private List<schoolResult> Schoolresult=new ArrayList<>();

}
