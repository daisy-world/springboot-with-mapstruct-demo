package com.app.easy2excel.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.app.easy2excel.dto.UserDTO;
import com.app.easy2excel.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

	@Mapping(source = "emailId", target = "email")
	@Mapping(source = "contactNo", target = "phoneNo")

	User toEntity(UserDTO userDTO);

	@Mapping(source = "email", target = "emailId")
	@Mapping(source = "phoneNo", target = "contactNo")

	UserDTO toDTO(User user);

	List<UserDTO> toDTOList(List<User> users);

}
