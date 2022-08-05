package com.app.easy2excel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.app.easy2excel.dto.EmployeeDetailsDTO;
import com.app.easy2excel.entity.Department;
import com.app.easy2excel.entity.Employee;

@Mapper(componentModel = "spring")
public interface EmployeeDetailsMapper {
	
	@Mapping(source = "employee.id", target = "empId")
	@Mapping(source = "employee.name", target = "empName")
	@Mapping(source = "department.deptName", target = "deptName")

	EmployeeDetailsDTO toEmployeeDetailsDTO(Employee employee,Department department);

}
