package com.example.Student.Controller;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.Model.StudentModel;
import com.example.Student.Service.StudentService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("student")
public class StudentController {

	@Autowired
	StudentService stuService;
	@GetMapping("/getstudent")
	public List<StudentModel> getAllstudent()
	{
		return stuService.getallstudent();
	}
	@GetMapping("/getstudentwithdep/{id}")
	@CircuitBreaker(name="studentservice",fallbackMethod="fallbackMethod")
	public CompletableFuture<String> getStudentwithdep(@PathVariable Long id)
	{
		return CompletableFuture.supplyAsync(()->stuService.getstudentwithdep(id));
	}
	
	public CompletableFuture<String> fallbackMethod(@PathVariable Long id,Exception e)
	{
		return CompletableFuture.supplyAsync(()->"Service is down,please try after some time");
	}
	
	
	@PostMapping("/addstudent")
	public StudentModel addstudent(@RequestBody StudentModel studentModel)
	{
		return stuService.addstudent(studentModel);
	}
	
}
