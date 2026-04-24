package com.vignesh.Book_Management_System.exception;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {

	@ExceptionHandler(BookAlreadyExistsException.class)
	public ResponseEntity<?> handleduplicate(BookAlreadyExistsException ex){

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("message",ex.getMessage()));
	}
	
	@ExceptionHandler(NoRecordFoundException.class)
	public ResponseEntity<?> noRecordFound(NoRecordFoundException ex){
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
		
	}
	
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<?> idNotFound(IdNotFoundException ex){
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
		
	}
}
