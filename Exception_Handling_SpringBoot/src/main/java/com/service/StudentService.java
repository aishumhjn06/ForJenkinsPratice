package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.CustomException.EmptyStudentListException;
import com.PoJo.Student;

@Service
public class StudentService {

	public List<Student> getList() throws EmptyStudentListException{
		
		List<Student> std = new ArrayList<>();
		if(std.isEmpty()) {
			throw new EmptyStudentListException("Empty student list");
		}
		
		return std;
	}
	
}
