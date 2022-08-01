package com.app.easy2excel.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.app.easy2excel.dto.ContactDTO;
import com.app.easy2excel.entity.Contact;

@Mapper(componentModel = "spring")
public interface ContactMapper {

	Contact toEntity(ContactDTO contactDTO);

	ContactDTO toDTO(Contact contact);

	List<ContactDTO> toDTOList(List<Contact> contacts);

}
