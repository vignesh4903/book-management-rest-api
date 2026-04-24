package com.vignesh.Book_Management_System.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.vignesh.Book_Management_System.entity.Books;
import com.vignesh.Book_Management_System.exception.BookAlreadyExistsException;
import com.vignesh.Book_Management_System.exception.IdNotFoundException;
import com.vignesh.Book_Management_System.exception.NoRecordFoundException;
import com.vignesh.Book_Management_System.repository.BmsRep;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BmsService {
	
	public final BmsRep rep;
	
	public Books insertBook(Books book) {
		if(rep.existsById(book.getIsbn())) {
			throw new BookAlreadyExistsException("Book Already Exists");
		}
		return rep.save(book);
	}

	public List<Books> displayBooks() {
		
		
		if(rep.findAll().isEmpty()) {
			
			throw new NoRecordFoundException("No Record Found");
		}
		
		return rep.findAll();
	}

	public void removeBook(long id) {
		
		if(!rep.existsById(id)) {
			throw new IdNotFoundException("id not found");
		}
		rep.deleteById(id);
		
		
	}

	public Books updateBook(long id, Books book) {
		
		if(!rep.existsById(id)) {
			
			throw new IdNotFoundException("id not found");
			
		}
		Books eb= rep.findById(id).get();
		eb.setTitle(book.getTitle());
		eb.setAuthor(book.getAuthor());
		eb.setPublication_year(book.getPublication_year());
		return rep.save(eb);
	}
	

	

}
