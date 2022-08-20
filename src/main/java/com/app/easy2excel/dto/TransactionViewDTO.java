package com.app.easy2excel.dto;

import lombok.Data;

@Data
public class TransactionViewDTO {

	private String transactionId;
	
	private PaymentViewType paymentViewType;
}
