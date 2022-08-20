package com.app.easy2excel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.easy2excel.dto.TransactionDTO;
import com.app.easy2excel.dto.TransactionViewDTO;
import com.app.easy2excel.service.TransactionService;

@RestController
public class TransactionController {
	@Autowired
	TransactionService transactionService;
	
	@PostMapping("/transaction")
	public ResponseEntity<TransactionViewDTO> getTransactionDetails(@RequestBody TransactionDTO transactionDTO) {
		return ResponseEntity.ok(transactionService.getTransactionDetails(transactionDTO));
	}

}
