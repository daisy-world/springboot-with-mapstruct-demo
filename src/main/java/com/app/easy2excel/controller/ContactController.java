package com.app.easy2excel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.easy2excel.dto.ContactDTO;
import com.app.easy2excel.entity.Contact;
import com.app.easy2excel.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	ContactService contactService;

 @PostMapping("/contact")
	public ResponseEntity<Contact> saveContact(@RequestBody ContactDTO contactDTO){
	return ResponseEntity.ok(contactService.saveContact(contactDTO));
   }
 
 @GetMapping("/contact/{id}")
 public ResponseEntity<ContactDTO> getContactById(@PathVariable Long id){
 return ResponseEntity.ok(contactService.getContactById(id));
  }
 
 @GetMapping("/contacts")
 public ResponseEntity<List<ContactDTO>> getContactList(){
 return ResponseEntity.ok(contactService.getContactList());
  }
	
}
