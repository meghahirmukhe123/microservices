package com.StudentData.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class studentException {
	
	@ExceptionHandler(value = IllegalArgumentException.class)
	public ResponseEntity<String> exceptionHandling(IllegalArgumentException ex)
	{
		String e = ex.getMessage();
		if(e.equals("wrong student id"))
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("this student id data is not available");
		}
		else if(e.equals("wrong school id"))
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("wrong school id" );
			
		}
		else if(e.equals("wrong teacher id" ))
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("this teacher id is not present in database");
		}
		else if(e.equals("wrong school result id"))
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("this school result is not present in database");
		}
		
		else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("internal server error");
		}
	
	}
	
				
		
		
}
