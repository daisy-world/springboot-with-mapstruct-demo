package com.app.easy2excel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.app.easy2excel.dto.EmployeeDTO;
import com.app.easy2excel.entity.Department;
import com.app.easy2excel.entity.Employee;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

	@Mapping(source = "empId", target = "id")
	@Mapping(source = "empName", target = "name")
	@Mapping(source = "deptName", target = "department.deptName")

	Employee toEntity(EmployeeDTO employeeDTO);
	
	@Mapping(source = "employee.id", target = "empId")
	@Mapping(source = "employee.name", target = "empName")
	@Mapping(source = "department.deptName", target = "deptName")
	
	EmployeeDTO toDTO(Employee employee,Department department);
}
