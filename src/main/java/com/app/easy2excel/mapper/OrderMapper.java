package com.app.easy2excel.mapper;


import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;

import com.app.easy2excel.dto.OrderDTO;
import com.app.easy2excel.entity.Order;

//@AfterMapping & @BeforeMapping
// Mapping with custom method

@Mapper(componentModel = "spring")
public interface OrderMapper {

	@BeforeMapping
	default void validate(OrderDTO orderDTO) {
		if(orderDTO.getQuantity()==0) {
			orderDTO.setQuantity(1);
		}
	}
	
	@Mapping(source="orderAmount",target="amount")
	@Mapping(source="orderDate",target="date" ,dateFormat = "yyyy-MMM-dd")
	@Mapping(source="orderStatus",target="status",qualifiedByName = "checkOrderStatus")
	Order toEntity(OrderDTO orderDTO);
	

	@Mapping(source="amount",target="orderAmount")
	@Mapping(source="date",target="orderDate" ,dateFormat = "yyyy-MMM-dd")
	@Mapping(source="status",target="orderStatus",qualifiedByName="checkOrderStatusInString")
	OrderDTO toDTO(Order order);
	
	
	@AfterMapping
	default void calculateSum(Order order,@MappingTarget OrderDTO orderDto) {
		float sum = 0;
		if(order.getQuantity()!=0 && order.getAmount() !=0) {
			sum = sum + (order.getQuantity()*order.getAmount());
			orderDto.setSum(sum);
		}
		
	}
	
	
	@Named("checkOrderStatus")
	default boolean checkOrderStatus(String orderStatus) {
		boolean flag;
		if(orderStatus.equals("Delivered")) {
			flag = true;
		}else {
			flag = false;	
		}
		return flag;
	}
	
	@Named("checkOrderStatusInString")
	default String checkOrderStatusInString(boolean status) {
		String orderStatus;
		if(status) {
			orderStatus = "Delivered";
		}else {
			orderStatus = "Pending";
		}
		return orderStatus;
	}
	
	
}
