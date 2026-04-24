package com.vignesh.Book_Management_System.exception;

public class BookAlreadyExistsException extends RuntimeException {

	public BookAlreadyExistsException(String message) {
		
		super(message);
	}
}
