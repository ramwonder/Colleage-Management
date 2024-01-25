package com.example.Department.Service;

import java.util.List;

import com.example.Department.Model.DepartmentModel;

public interface DepartmentSeriveRepo {
	
	public DepartmentModel adddep(DepartmentModel department);
	public DepartmentModel getdep(Long id);	
	public String deletedep(Long id);
	public List<DepartmentModel> getalldep();
	public DepartmentModel updatedep(DepartmentModel dep);
		
	
	
	

}
