package com.example.Department.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Department.Model.DepartmentModel;
import com.example.Department.Service.DepartmentService;

@RestController
@RequestMapping("department")
public class Departmentcontroller {
	
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/hello")
	public String  helloworld()
	{
		return "hi how are u?";
	}
	@PostMapping("/adddep")
	public DepartmentModel adddep(@RequestBody DepartmentModel department)
	{
		 departmentService.adddep(department);
		return department;
		
	}
	@GetMapping("/getdep")
	public List<DepartmentModel> getAlldep() {
		return departmentService.getalldep();
		
	}
	@GetMapping("/getdep/{id}")
	public DepartmentModel getdep(@PathVariable Long id)
	{
		
		return departmentService.getdep(id);
	}
	@DeleteMapping("/deletdep/{id}")
	public String deletedep(@PathVariable Long id)
	{
		return  departmentService.deletedep(id);
	}
	
	@PutMapping("/updatedep")
	public DepartmentModel updatedep(@RequestBody DepartmentModel dep)
	{
		return departmentService.updatedep(dep);
		
	}
	
}
