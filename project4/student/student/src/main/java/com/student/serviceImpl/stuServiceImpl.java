package com.student.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.student.entity.stu;
import com.student.entity.stuBio;
import com.student.entity.stumarks;
import com.student.repo.sturepo;
import com.student.service.stuservice;

@Service
public class stuServiceImpl implements stuservice {

	
	@Autowired 
	private sturepo Sturepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private Logger logger=LoggerFactory.getLogger(stuServiceImpl.class);
	
	
	@Override
	public stu saveStu(stu Stu) {
		
		return Sturepo.save(Stu);
	}

	
	//to get all stu bio and student data at a time
	@Override
	public List<stu> getAllStudents() {
		List<stu> students = Sturepo.findAll();
		
		for(stu s:students)
		{
			ArrayList<stuBio> bioAns= restTemplate.getForObject("http://STUDENTBIO-SERVICE/bio/student/"+s.getStuId(), ArrayList.class);
			logger.info("{} ",bioAns);
			s.setStuBio(bioAns);
		}
		return students;
		
		
		
	}

	
	//to get stu bio and student data of particular student id
//	@Override
//	public stu getStuByStuId(String stuId) {
//		stu S=Sturepo.findById(stuId).orElseThrow(null);
//		
//		//fetch bio of above student
//		//http://localhost:9003/bio/student/2
//		ArrayList<stuBio> bioAns=restTemplate.getForObject("http://localhost:9003/bio/student/"+S.getStuId(), ArrayList.class);
//		logger.info("{} ",bioAns);
//		S.setStuBio(bioAns);
//		return S;
//	}
	
	
	//get student data,student bio,student marks of particular student
	@Override
	public stu getStuByStuId(String stuId) {
		stu s =Sturepo.findById(stuId).orElseThrow(null);
		
		stuBio[] bioAns=restTemplate.getForObject("http://STUDENTBIO-SERVICE/bio/student/"+s.getStuId(), stuBio[].class);
		
		logger.info("{} ",bioAns);
		
		List<stuBio> bio=Arrays.stream(bioAns).toList();
		
		List<stuBio> biolist=bio.stream().map(mark -> {
			
			//http://localhost:9002/marks/458d84e7-b928-4156-b389-d456127f8485
			ResponseEntity<stumarks> forEntity=restTemplate.getForEntity("http://STUDENTMARKS-SERVICE/marks/"+mark.getResultid(), stumarks.class);
			stumarks m=forEntity.getBody();
			
			mark.setStumarks(m);
			return mark;
		}).collect(Collectors.toList());
		
		s.setStuBio(biolist);
		return s;
		
	
		
	}

}
