package com.app.easy2excel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;

import com.app.easy2excel.dto.PaymentType;
import com.app.easy2excel.dto.PaymentViewType;
import com.app.easy2excel.dto.TransactionDTO;
import com.app.easy2excel.dto.TransactionViewDTO;

// Mapping Enum

@Mapper(componentModel = "spring")
public interface TransactionMapper {

	
	 @ValueMapping(source = "NETBANKING", target = "NET_BANKING")
	// @ValueMapping(source = "CREDIT_CARD", target = "CARD")
	// @ValueMapping(source = "DEBIT_CARD", target = "CARD")
	// @ValueMapping(source = MappingConstants.ANY_REMAINING, target = "CARD") //ANY_REMAINING map default value first then any other values will be mapped to a general one. 
	                                                                             
	 @ValueMapping(source = MappingConstants.ANY_UNMAPPED, target = "CARD")   // ANY_UNMAPPED, instead of mapping the default value first ,it will map all the unmapped value .
	 
	@Mapping(source = "paymentType", target ="paymentViewType" )
	TransactionViewDTO toViewDTO(TransactionDTO transactionDTO);

}
