package com.app.easy2excel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.app.easy2excel.dto.EmployeeDTO;
import com.app.easy2excel.entity.Employee;

@Mapper(componentModel = "spring",uses= {DepartmentMapper.class})
public interface EmployeeMapper {

	@Mapping(source="empName",target="name")
	@Mapping(source="empId",target="id")
	//@Mapping(source="departmentName",target="department.deptName") // when departmentName is a direct field inside EmployeeDTO
	@Mapping(source="departmentDTO",target="department")
	Employee toEntity(EmployeeDTO employeeDTO);
	
	@Mapping(source="name",target="empName")
	@Mapping(source="id",target="empId")
	//@Mapping(source="department.deptName",target="departmentName")// when departmentName is a direct field inside EmployeeDTO
	@Mapping(source="department",target="departmentDTO")
	EmployeeDTO toDTO(Employee employee);
	
	
	
}
