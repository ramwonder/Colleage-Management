package com.example.Department.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Department.Model.DepartmentModel;
import com.example.Department.Repo.DepartmentRepo;

@Service
public class DepartmentService   implements DepartmentSeriveRepo{

	@Autowired
	DepartmentRepo departmentRepo;
	
	@Override
	public DepartmentModel adddep(DepartmentModel department) {
		// TODO Auto-generated method stub
		 DepartmentModel value=  departmentRepo.save(department);
		return value;
	}

	@Override
	public DepartmentModel getdep(Long id) {
		// TODO Auto-generated method stub
		DepartmentModel depmodel= departmentRepo.findById(id).get();
		
		return depmodel;
	}

	@Override
	public String deletedep(Long id) {
		// TODO Auto-generated method stub
		if(departmentRepo.findById(id).isPresent())
		{
			departmentRepo.deleteById(id);
			return id + "successfull deleted";
		}
		return  id + "not found ";
	}

	public List<DepartmentModel> getalldep() {
		// TODO Auto-generated method stub
		List<DepartmentModel> deplist= departmentRepo.findAll();
		return deplist;
	}

	@Override
	public DepartmentModel updatedep(DepartmentModel dep) {
		// TODO Auto-generated method stub
		 if(departmentRepo.existsById(dep.id))
			 
		 {
		Optional<DepartmentModel> dep1=departmentRepo.findById(dep.id);
		
			DepartmentModel depModel= dep1.get();
			depModel.setDepartmentName(dep.departmentName);
			depModel.setDepartmentaddress(dep.departmentaddress);
			depModel.setDepartmentcode(dep.departmentcode);
			
			departmentRepo.save(depModel);
			return depModel;
			
			
		 }
		 return null;
		
	}

}
