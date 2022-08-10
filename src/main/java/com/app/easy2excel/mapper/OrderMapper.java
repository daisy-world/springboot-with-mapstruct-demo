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
	@Mapping(source="orderStatus",target="status",qualifiedByName = "checkOrderStatus")
	Order toEntity(OrderDTO orderDTO);
	

	@Mapping(source="amount",target="orderAmount")
	@Mapping(source="date",target="orderDate" ,dateFormat = "yyyy-MMM-dd")
	@Mapping(source="status",target="orderStatus",qualifiedByName="checkOrderStatusInString")
	OrderDTO toDTO(Order order);
	
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
