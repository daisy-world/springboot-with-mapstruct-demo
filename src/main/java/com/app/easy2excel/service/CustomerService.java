package com.app.easy2excel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.easy2excel.dto.ContactDTO;
import com.app.easy2excel.dto.CustomerDTO;
import com.app.easy2excel.entity.Customer;
import com.app.easy2excel.mapper.CustomerMapper;
import com.app.easy2excel.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	CustomerMapper customerMapper;

	public Customer saveCustomer(CustomerDTO customerDTO) {
		return customerRepository.save(customerMapper.toEntity(customerDTO));
	}

	public CustomerDTO getCustomerById(Long id) {
		return customerRepository.findById(id)
                .map(customerMapper::toDTO)
                .orElse(new CustomerDTO());
	}

}
