package com.starapp.showlist_employees_to_manager.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.starapp.showlist_employees_to_manager.entity.Employee;
import com.starapp.showlist_employees_to_manager.entity.Project;
import com.starapp.showlist_employees_to_manager.repository.EmployeeRepository;



@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
    	

//	@GetMapping("/employeess")
//	public List<String> fetchAllProject(){
//
//		return employeeRepository.findAllUsers();
//	}
//	@GetMapping("/employeess/{Projectid}")
//	public List<Project> fetchAllProject(@PathVariable("Projectid") String Projectid){
//	
//		return employeeRepository.findProjectByprojectName(Projectid);
//	}
      

//	@GetMapping("/employeesss/{managerid}")
//	public List<String> fetchAllProject(@PathVariable("managerid") int managerid){
//	
//		return employeeRepository.findAllProject(managerid);
//	}
//	@GetMapping("/employeesssd/{managerid}")
//	public List<String> fetchAlltimesheet(@PathVariable("managerid") int managerid){
//	
//		return employeeRepository.findAllTimesheet(managerid);
//	}
	
}