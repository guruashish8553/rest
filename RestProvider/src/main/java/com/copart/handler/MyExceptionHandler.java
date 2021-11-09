package com.copart.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.copart.exception.StudentNotFoundException;
import com.copart.model.ErrorType;

@RestControllerAdvice
public class MyExceptionHandler {

	//@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorType> handleStudentNotFoundException(StudentNotFoundException ex){
		System.out.println(HttpStatus.INTERNAL_SERVER_ERROR.value());
		return new ResponseEntity<ErrorType>(
				new ErrorType( new Date(),HttpStatus.INTERNAL_SERVER_ERROR.value(),HttpStatus.INTERNAL_SERVER_ERROR.name(),ex.getMessage())
				,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
