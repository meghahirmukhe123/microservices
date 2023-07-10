package com.Teacher.exceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class globalExceptionHandling {
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handlingException(IllegalArgumentException ex)
	{
		String error= ex.getMessage();
		
		if(error.equals("wrong teacher grp id"))
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("no data is present in database of this teacher id");
		}
		
		else if(error.equals("wrong school id"))
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("this is school id releted data is not available");
		}
		else if(error.equals("wrong student id"))
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("this student id related data is not present in database");
		}
		else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("internal server error");
		}
			
	
	}

}
