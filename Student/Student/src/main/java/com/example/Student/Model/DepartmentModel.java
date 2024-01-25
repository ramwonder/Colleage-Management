package com.example.Student.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentModel {
	
	public Long depid;
	public String departmentName;
	public String departmentaddress;
	public String departmentcode;

}
