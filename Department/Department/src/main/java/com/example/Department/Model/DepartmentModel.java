package com.example.Department.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="department_tbl")
public class DepartmentModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public Long id;
	public String departmentName;
	public String departmentaddress;
	public String departmentcode;
	
	

}
