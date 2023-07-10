package com.School.serviceImpl;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.School.entity.schoolResult;
import com.School.entity.schoolinfo;
import com.School.entity.student;
import com.School.entity.teacherGrp;
import com.School.exceptionHandler.schoolException;
import com.School.external.services.schoolResultServices;
import com.School.external.services.studentServices;
import com.School.external.services.teacherGrpServices;
import com.School.repo.schoolrepo;
import com.School.service.schoolService;

import ch.qos.logback.classic.Logger;

@Service
public class schoolImpl implements schoolService{

	
	@Autowired
	private schoolrepo Schoolrepo;
	
	@Autowired
	private teacherGrpServices TeacherGrp;
	
	@Autowired
	private studentServices Students;
	
	@Autowired
	private schoolResultServices ResultServices;
	
	
	private org.slf4j.Logger logger= LoggerFactory.getLogger(schoolImpl.class);
	
	@Override
	public schoolinfo createInfo(schoolinfo School) {
		// TODO Auto-generated method stub
		return Schoolrepo.save(School);
	}

	@Override
	public List<schoolinfo> getAllSchoolData() {
		// TODO Auto-generated method stub
		return Schoolrepo.findAll();
	}

	@Override
	public schoolinfo getBySchoolId(String schoolId) throws schoolException 
	{
		Optional<schoolinfo> s = Schoolrepo.findById(schoolId);
		
		schoolinfo x = null;
		if(s.isPresent())
		{
			x= s.get();
			
			//added teacher grp data in school info
			List<teacherGrp> t1= TeacherGrp.getAllTeacherGrp(x.getSchoolId());
			
			
			
			//adding student in teacher service
			List<teacherGrp> grpList= t1.stream().map(t2 -> {
				
				student s1= Students.getAllStudents(t2.getStuId());
				
				if(s1 != null)
				{
					List<schoolResult> sResult= ResultServices.getAllResults(t2.getSchoolId());
					s1.setSchoolresult(sResult);
				}
				
				
				t2.setStudent(s1);
				return t2;
			}).collect(Collectors.toList());
			
			x.setTeacherGrp(grpList);
		}
		
		else {
			
			throw new schoolException();
		}
		
		
		
		return x;
		
	}

}
