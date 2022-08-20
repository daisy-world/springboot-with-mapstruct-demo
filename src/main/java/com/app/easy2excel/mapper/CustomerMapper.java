package com.app.easy2excel.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.app.easy2excel.dto.CustomerDTO;
import com.app.easy2excel.entity.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
	
	@Mapping(source="customerId",target="id")
	@Mapping(source="customerName",target="name")
	@Mapping(source="countryName",target="country")
	@Mapping(source="registrationDate",target="registrationDate",dateFormat ="dd/MM/yyyy")

	Customer toEntity(CustomerDTO customerDTO);
	
	@Mapping(source="id",target="customerId")
	@Mapping(source="name",target="customerName")
	@Mapping(source="country",target="countryName")
	@Mapping(source="registrationDate",target="registrationDate",dateFormat ="dd/MM/yyyy")
	
    CustomerDTO toDTO(Customer customer);

}
