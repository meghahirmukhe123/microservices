package com.stuReport.service;

import java.util.List;

import com.stuReport.entity.stureport;

public interface stureportservice {

	//create
	stureport create(stureport Stureport);
	
	//get all report data
	List<stureport> getreportdata();
	
	//get by id
	List<stureport> getReportdataByStuId(String stuId);
}
