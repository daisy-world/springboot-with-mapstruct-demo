package com.app.easy2excel.dto;

import lombok.Data;

@Data
public class EmployeeDTO {

	private Long empId;
	private String empName;
	private String email;
	private float salary;
	private DepartmentDTO departmentDTO;
	
}
