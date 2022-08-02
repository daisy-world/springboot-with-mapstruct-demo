package com.app.easy2excel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.easy2excel.dto.UserDTO;
import com.app.easy2excel.entity.User;
import com.app.easy2excel.mapper.UserMapper;
import com.app.easy2excel.repository.UserRepository;

@Service
public class UserService {
	
	 @Autowired
	 UserRepository userRepository;
	 
	 @Autowired
	 UserMapper userMapper;


	public User saveUser(UserDTO userDTO) {
		 return userRepository.save(userMapper.toEntity(userDTO));
	}

	public UserDTO getUserById(Long id) {

		return userRepository.findById(id)
				             .map(userMapper::toDTO )
				             .orElse(new UserDTO());
	}

	public List<UserDTO> getUserList() {
		List<User> users = 	userRepository.findAll();
		return  userMapper.toDTOList(users);
	}

}
