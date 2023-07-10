package com.School.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class globalExceptionHandler {
	
	@ExceptionHandler(value=schoolException.class)
	
	public ResponseEntity<Object> notFound()
	{
		return new ResponseEntity<>("this school id information is not present in database",HttpStatus.NOT_FOUND);
	}
	
	

}
