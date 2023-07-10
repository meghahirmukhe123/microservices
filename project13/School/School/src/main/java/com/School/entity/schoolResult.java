package com.School.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class schoolResult {
	
	private String resultId;
	private String stuId;
	private String teacherId;
	private String schoolId;
	private int rating;
	private char grade;

}
