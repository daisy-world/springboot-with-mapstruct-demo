package com.app.easy2excel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.app.easy2excel.dto.OrderDTO;
import com.app.easy2excel.entity.Order;

@Mapper(componentModel = "spring")
public interface OrderMapper {

	@Mapping(source="orderAmount",target="amount")
	@Mapping(source="orderDate",target="date" ,dateFormat = "yyyy-MMM-dd")	
	Order toEntity(OrderDTO orderDTO);
	

	@Mapping(source="amount",target="orderAmount")
	@Mapping(source="date",target="orderDate" ,dateFormat = "yyyy-MMM-dd")
	OrderDTO toDTO(Order order);
	

}
