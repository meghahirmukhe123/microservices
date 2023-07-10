package com.School.entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class teacherGrp {
	
	private String teacherGrpId;
	private String schoolId;
	private String stuId;
	private String exp;
	
	private student Student;
}
