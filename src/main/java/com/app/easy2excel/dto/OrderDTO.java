package com.app.easy2excel.dto;

import lombok.Data;

@Data
public class OrderDTO {

	private Long id;
	
	private String orderAmount;
	
	private String description;
	
	private String orderDate;
	
	private String orderStatus;
	
	
}
