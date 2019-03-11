package com.websystique.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/home")
	public ResponseEntity<?> home(ModelMap model) {
    
	ResponseEntity<String> responseEntity = new ResponseEntity<String>("hello world",HttpStatus.OK);
	return responseEntity;
	}
}
