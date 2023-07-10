package com.student.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.student.entity.studentClass;
import com.student.entity.stureport;
import com.student.repo.stuRepo;
import com.student.service.stuservice;

@Service
public class stuImpl implements stuservice {
	
	@Autowired
	private stuRepo Sturepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private Logger logger=LoggerFactory.getLogger(stuImpl.class);

	@Override
	public studentClass savestudent(studentClass Studentclass) {
		
		return Sturepo.save(Studentclass);
	}

	@Override
	public List<studentClass> getallstudents() {
		
		return Sturepo.findAll();
	}

	@Override
	public studentClass getStudentByStuId(String stuId) {
		
		
		//get student by student id
		studentClass s=Sturepo.findById(stuId).orElseThrow(null);
		
		//fetch student report from Student report service
		//http://localhost:8002/report/stu/102
		ArrayList<stureport> report  = restTemplate.getForObject("http://STUDENTREPORT-SERVICE/report/stu/"+s.getStuId(), ArrayList.class);
		logger.info("{} ",report);
		s.setReport(report);
		return s;
	}
	

}
