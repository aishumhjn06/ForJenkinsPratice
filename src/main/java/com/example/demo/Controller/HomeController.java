package com.example.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/get")
	public ResponseEntity<String>getName(){
		return  ResponseEntity.status(HttpStatus.OK).body("Success");
	}
	
}