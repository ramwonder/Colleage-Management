package com.example.Student.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Student.Model.StudentModel;

@Repository
public interface StudentRepo extends JpaRepository<StudentModel, Long> {

}
