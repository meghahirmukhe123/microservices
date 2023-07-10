package com.schoolResult.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
@Document(collection = "schoolResult")
public class schoolResult {
	@Id
	private String resultId;
	private String stuId;
	private String teacherId;
	private String schoolId;
	private int rating;
	private char grade;

}
