package com.vignesh.Book_Management_System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Books {
	
	@NotBlank(message = "title not found")
	private String title;
	@NotBlank(message = "author not found")
	private String author;
	@Id
	private long isbn;
	@NotNull(message = "publication year not found")
	private long publication_year;
}
