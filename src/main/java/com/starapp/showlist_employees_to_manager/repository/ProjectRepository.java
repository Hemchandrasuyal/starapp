package com.starapp.showlist_employees_to_manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.starapp.showlist_employees_to_manager.entity.Project;


public interface ProjectRepository extends JpaRepository<Project,String> {
@Query("Select p from Project p where p.employee.Employeeid=?1")	
List<Project> findByemployeeId(int Employeeid);
}
