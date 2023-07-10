package com.School.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
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
@Builder
@ToString

@Document(collection = "schoolinfo")
public class schoolinfo {

	@Id
	private String schoolId;
	private String schoolName;
	private String teacherGrpId;
	private String stuId;
	private String resultId;
	
	
	
	@Transient
	private List<teacherGrp> TeacherGrp= new ArrayList<>();
	
	
}
