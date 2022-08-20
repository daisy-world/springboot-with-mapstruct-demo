package com.app.easy2excel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.easy2excel.dto.TransactionDTO;
import com.app.easy2excel.dto.TransactionViewDTO;
import com.app.easy2excel.mapper.TransactionMapper;

@Service
public class TransactionService {
	@Autowired
	TransactionMapper transactionMapper;

	public TransactionViewDTO getTransactionDetails(TransactionDTO transactionDTO) {

		return transactionMapper.toViewDTO(transactionDTO);
	}
	
	

}
