package com.StudentData.entity;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
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
@Document(collection = "student")
public class student 
{

	@Id
	private String stuId;
	private String schoolId;
	private String teachegrpId;
	private String resultId;
	private String name;
}
