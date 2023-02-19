package com.starapp.showlist_employees_to_manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.starapp.showlist_employees_to_manager.entity.Project;
import com.starapp.showlist_employees_to_manager.entity.ProjectEmployeeMapping;
import com.starapp.showlist_employees_to_manager.entity.Timesheet;
import com.starapp.showlist_employees_to_manager.repository.EmployeeRepository;
import com.starapp.showlist_employees_to_manager.repository.TimesheetRepository;

@RestController
public class TimesheetController {
	
	@Autowired
	TimesheetRepository timesheetRepository;
	
	//showalltimesheetto manager
	@CrossOrigin("*")
	@GetMapping("/java/showtimesheettomanager/{managerid}")
	public List<Timesheet> fetchAlltimesheet(@PathVariable("managerid") int managerid){
	  
		return timesheetRepository.findAllTimesheet(managerid);
	}
	//update status of timesheet of employee by manager
	@PatchMapping("/java/showtimesheettomanager/{managerid}/{timesheetid}")
	public Timesheet updatestatus(@PathVariable int managerid,@PathVariable String timesheetid) {
		Timesheet timesheet = timesheetRepository.findBytimesheetId(timesheetid);
		timesheet.setApproval(1);
		return timesheetRepository.save(timesheet);
		
	}

	//showtimesheetbasedonprojectid
	@CrossOrigin("*")	
	@GetMapping("/java/showtimesheettomanagerprojectwise/{managerid}/{projectid}")
	public List<Timesheet> fetchAlltimesheetOfUserBasedOnProjectId(@PathVariable("managerid") int employeeid,@PathVariable("projectid") String projectid){
		
		return timesheetRepository.findByemployeeId(employeeid,projectid);
	}
	
	//show all timesheet to manager
	@CrossOrigin("*")	
	@GetMapping("/java/showtimesheettoemployee/{employeeid}")
	public List<Timesheet> fetchAlltimesheetOfUser(@PathVariable("employeeid") int employeeid){
	
		return timesheetRepository.findByemployeeId(employeeid);
	}
	
	//show all timesheet to employee based on aprroval status 1-approved and 0-rejected
	@CrossOrigin("*")	
	@GetMapping("/java/showtimesheettoemployee/{employeeid}/{approval}")
	public List<Timesheet> fetchAlltimesheetOfUser(@PathVariable("employeeid") int employeeid,@PathVariable("approval")int approval){
	
		return timesheetRepository.findByemployeeIdapproval(employeeid,approval);
	}
	
	
	
	
	
	
	

	
}
