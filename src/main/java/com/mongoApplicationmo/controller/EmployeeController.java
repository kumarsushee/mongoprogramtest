package com.mongoApplicationmo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mongoApplicationmo.model.EmployeeModel;
import com.mongoApplicationmo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService objEmployeeService;
	
	
	@PostMapping("/saveEmployeeDeatil")
	
	public String saveEmployeeDeatil(@RequestBody EmployeeModel objEmp) {
		return objEmployeeService.saveDetail(objEmp);
		
	}
	
	

	@GetMapping("/getEmployeeDeatil")
	
	public void getEmployeeDeatil(@RequestParam String name,@RequestParam int age) {
		 objEmployeeService.getDetails(name,age);
		
	}
	
	
}
