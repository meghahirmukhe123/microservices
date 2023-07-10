package com.StudentData.serviceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentData.entity.student;

import com.StudentData.repo.studentrepo;
import com.StudentData.service.studentData;


@Service
public class studentImpl implements studentData{

	
	@Autowired 
	private studentrepo Studentrepo;
	
	
	@Override
	public student createStudentData(student Student) {
		// TODO Auto-generated method stub
		return Studentrepo.save(Student);
	}

	@Override
	public List<student> getAllStudentsData() {
		// TODO Auto-generated method stub
		return Studentrepo.findAll();
	}

	@Override
	public Optional<student> getbyStuId(String stuId) {
		Optional<student> s = Studentrepo.findById(stuId);
		if(s.isEmpty())
		{
			throw new IllegalArgumentException("wrong student id");
		}
		return s;
	}

	@Override
	public List<student> getbyTeacherGrpid(String teachegrpId) {
		List<student> s1 = Studentrepo.findByteachegrpId(teachegrpId);
		
		if(s1.isEmpty())
		{
			throw new IllegalArgumentException("wrong teacher id");
		}
		return s1;
		
	}

	@Override
	public List<student> getbyResultId(String resultId){
		List<student> s2 = Studentrepo.findByresultId(resultId);
		
		if(s2.isEmpty())
		{
			throw new IllegalArgumentException("wrong school result id");
		}
		return s2;
	}
	

	@Override
	public List<student> getbySchoolId(String schoolId)  {
		List<student> s3 = Studentrepo.findByschoolId(schoolId);
		
		if(s3.isEmpty())
		{
			throw new IllegalArgumentException("wrong school id");
		}
		return s3;
	}

}
