package com.example.Department.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Department.Model.DepartmentModel;

@Repository
public interface DepartmentRepo extends JpaRepository<DepartmentModel, Long> {

}
