package com.ExceptionHandlingController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.CustomException.EmptyStudentListException;

@RestControllerAdvice
public class ExceptionHandleController {
	
	
	@ExceptionHandler(EmptyStudentListException.class)
	public ResponseEntity<String> EmptyList(EmptyStudentListException emptyStudentListException){
		return new ResponseEntity<>("Student List empty,Please check", HttpStatus.BAD_REQUEST);
		
	}
	
	
	//or
//	 @ResponseStatus(value=HttpStatus.BAD_REQUEST, reason ="Student List empty,Please check")
//	 @ExceptionHandler(EmptyStudentListException.class)
//	 public void EmptyList(){
//		 
//	 }

}
