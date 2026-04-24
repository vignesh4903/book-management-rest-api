package com.vignesh.Book_Management_System.controller;

import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vignesh.Book_Management_System.entity.Books;
import com.vignesh.Book_Management_System.service.BmsService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BmsController {

	public final BmsService bs;
	
	@PostMapping
	public ResponseEntity<?> addBook(@Valid @RequestBody Books book){
		
		   return ResponseEntity.status(HttpStatus.CREATED).body(bs.insertBook(book));
		
	}
	
	@GetMapping
	public  ResponseEntity<List<Books>> showBooks(){
		  
		 return ResponseEntity.ok(bs.displayBooks());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteBooks(@PathVariable long id){
		bs.removeBook(id);
		return ResponseEntity.ok(Map.of("message","deleted successfully"));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateBookDetail(@RequestBody Books book, @PathVariable long id ){
		return ResponseEntity.ok(bs.updateBook(id,book));
	}
}
