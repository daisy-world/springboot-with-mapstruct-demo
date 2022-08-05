package com.app.easy2excel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.easy2excel.dto.EmployeeDTO;
import com.app.easy2excel.dto.EmployeeDetailsDTO;
import com.app.easy2excel.entity.Employee;
import com.app.easy2excel.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
		return ResponseEntity.ok(employeeService.saveEmployee(employeeDTO));
	}

	 @GetMapping("/employee/{id}")
		public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable Long id) {
			return ResponseEntity.ok(employeeService.getEmployeeById(id));
		}
	 
	 @GetMapping("/employee-details/{id}")
		public ResponseEntity<EmployeeDetailsDTO> getEmployeeDetailsById(@PathVariable Long id) {
			return ResponseEntity.ok(employeeService.getEmployeeDetailsById(id));
		}
		

}
