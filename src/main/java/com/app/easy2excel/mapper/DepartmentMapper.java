package com.app.easy2excel.mapper;

import org.mapstruct.Mapper;

import com.app.easy2excel.dto.DepartmentDTO;
import com.app.easy2excel.entity.Department;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
	
	Department toEntity(DepartmentDTO departmentDTO);
	
	DepartmentDTO toDTO(Department department);


}
