package com.app.easy2excel.dto;

import lombok.Data;

@Data
public class TransactionDTO {

	private String transactionId;
	
	private PaymentType paymentType;

}
