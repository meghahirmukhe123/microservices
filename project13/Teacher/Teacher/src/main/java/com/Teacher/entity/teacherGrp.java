package com.Teacher.entity;

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
@Document(collection = "teacherGrp")
public class teacherGrp {
	
	@Id
	private String teacherGrpId;
	private String schoolId;
	private String stuId;
	private String exp;
	

}
