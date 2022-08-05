package com.app.easy2excel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.app.easy2excel.dto.EmployeeDTO;
import com.app.easy2excel.entity.Employee;

@Mapper(componentModel = "spring",uses= {DepartmentMapper.class})
public interface EmployeeMapper {

	@Mapping(source = "empId", target = "id")
	@Mapping(source = "empName", target = "name")
	@Mapping(source = "departmentDTO.deptName", target = "department.deptName")
	
	Employee toEntity(EmployeeDTO employeeDTO);
	
	@Mapping(source = "id", target = "empId")
	@Mapping(source = "name", target = "empName")
	@Mapping(source = "department.deptName",target = "departmentDTO.deptName")

	EmployeeDTO toDTO(Employee employee);
}
