package com.example.Student.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.example.Student.Model.StudentModel;

public interface Studentservicerepo {
	
	public List<StudentModel> getallstudent();
	public StudentModel addstudent(StudentModel studentModel);
	public String getstudentwithdep(Long id);

}
