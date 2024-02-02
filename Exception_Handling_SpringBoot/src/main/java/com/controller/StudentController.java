package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CustomException.EmptyStudentListException;
import com.PoJo.Student;
import com.service.StudentService;

@RestController
@RequestMapping("/")
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/save")
	public ResponseEntity<String> saveStudent() {
		System.out.println("here in save student method");
		return new ResponseEntity<>("Student saved", HttpStatus.OK);
	}

	@GetMapping("/getStudentsList")
	public ResponseEntity<List<Student>> getList() throws EmptyStudentListException {

		// suppose we got list from database and that list is empty and we are
		// throwing empty list error
		List<Student> std = studentService.getList();

		return new ResponseEntity<>(std, HttpStatus.OK);
	}
}
