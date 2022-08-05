package com.app.easy2excel.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.easy2excel.dto.EmployeeDTO;
import com.app.easy2excel.entity.Employee;
import com.app.easy2excel.mapper.EmployeeMapper;
import com.app.easy2excel.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	 @Autowired
	 EmployeeMapper employeeMapper;

	public Employee saveEmployee(EmployeeDTO employeeDTO) {
		return employeeRepository.save(employeeMapper.toEntity(employeeDTO));
	}

	public EmployeeDTO getEmployeeById(Long id) {
		return employeeRepository.findById(id)
	             .map(employeeMapper::toDTO )
	             .orElse(new EmployeeDTO());
	}

	

}
