package com.example.Student.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Student.Model.DepartmentModel;
import com.example.Student.Model.StudentModel;
import com.example.Student.Repo.StudentRepo;

@Service
public class StudentService implements Studentservicerepo {

	private String baseurl="http://DepartmentService:8080/department/getdep/";
	
	@Autowired
	StudentRepo studentRepo;
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public List<StudentModel> getallstudent() {
		// TODO Auto-generated method stub
		
	List<StudentModel> student=	studentRepo.findAll();
		return student;
	}
	@Override
	public StudentModel addstudent(StudentModel studentModel) {
		// TODO Auto-generated method stub
		StudentModel value=  studentRepo.save(studentModel);
		return value;
	}
	@Override
	public String getstudentwithdep(Long id) {
		// TODO Auto-generated method stub
		StudentModel studentModel=studentRepo.findById(id).get();
		DepartmentModel depModel=restTemplate.getForObject(baseurl+studentModel.getDepid(),DepartmentModel.class);
		StringBuffer buffer=new StringBuffer();
		buffer.append("\n");
		buffer.append(studentModel.getStudentid()+ " " +studentModel.getFirstName()+ " "+
		studentModel.getLastName()+" "+studentModel.email + " "+studentModel.getDepid());
		buffer.append("\n");
		buffer.append(depModel.getDepartmentName()+" "+depModel.departmentaddress
				+" "+depModel.getDepartmentcode());
		
		return buffer.toString();
	}

}
