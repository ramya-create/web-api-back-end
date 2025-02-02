package com.example.web_api.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.web_api.RequestClass.LoginRequest;

@CrossOrigin(origins =  "*")
@RestController
@RequestMapping(value = "/api")
public class ApiController {
	
	@PostMapping(value = "/login")
	public String getLogin(@RequestBody LoginRequest request) {
		return request.getUsername() + " Developer";
	}

}
