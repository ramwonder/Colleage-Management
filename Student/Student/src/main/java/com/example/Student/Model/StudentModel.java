package com.example.Student.Model;

import java.sql.Date;

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
@Table(name="Student_tbl")
public class StudentModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public Long studentid;
	public String firstName;
	public String lastName;
	public String email;
	
	public Long depid;

}
