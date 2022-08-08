package com.app.easy2excel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.easy2excel.dto.ContactDTO;
import com.app.easy2excel.dto.OrderDTO;
import com.app.easy2excel.entity.Order;
import com.app.easy2excel.mapper.OrderMapper;
import com.app.easy2excel.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	OrderMapper orderMapper;
	
	public Order saveOrder(OrderDTO orderDTO) {
		return orderRepository.save(orderMapper.toEntity(orderDTO));
	}

	public OrderDTO getOrderById(Long id) {
		return orderRepository.findById(id)
                .map(orderMapper::toDTO)
                .orElse(new OrderDTO());
	}

}
