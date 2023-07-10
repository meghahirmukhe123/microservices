package com.Teacher.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Teacher.entity.teacherGrp;
import com.Teacher.repo.teacherRepo;
import com.Teacher.service.teacherService;

@Service
public class teacherGrpImpl implements teacherService{

	
	@Autowired
	private teacherRepo TeacherRepo;
	
	
	@Override
	public teacherGrp createData(teacherGrp TeacherGrp) {
		// TODO Auto-generated method stub
		return TeacherRepo.save(TeacherGrp);
	}

	@Override
	public List<teacherGrp> getAllTeacherGrpData() {
		// TODO Auto-generated method stub
		return TeacherRepo.findAll();
	}

	@Override
	public Optional<teacherGrp> getByTeacherId(String teacherGrpId)
	{
		Optional<teacherGrp> grp= TeacherRepo.findById(teacherGrpId);
		
		
		if(grp.isEmpty())
		{
			throw new IllegalArgumentException("wrong teacher grp id");
		}
		return grp;
	}

	@Override
	public List<teacherGrp> getBySchoolId(String schoolId) {
		List<teacherGrp> list = TeacherRepo.findByschoolId(schoolId);
		if(list.isEmpty())
		{
			throw new IllegalArgumentException("wrong school id");
		}
		return list;
	}

	@Override
	public List<teacherGrp> getByStudentId(String stuId) {
		List<teacherGrp> list1 = TeacherRepo.findBystuId(stuId);
		if(list1.isEmpty())
		{
			throw new IllegalArgumentException("wrong student id");
		}
		return list1;
	}

}
