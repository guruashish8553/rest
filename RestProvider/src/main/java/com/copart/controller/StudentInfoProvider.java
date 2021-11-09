package com.copart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.copart.exception.StudentNotFoundException;

@RestController
@RequestMapping("/v1")
public class StudentInfoProvider {

	
	
	@GetMapping("/showstudent")
	//@PostMapping("/showstudent")
	public Boolean showStudent(@RequestParam Long sno) throws StudentNotFoundException {
		System.out.println(sno);
		if(sno==10)
			throw new StudentNotFoundException("Student Record not founded");
		return true;
	}
	
}
