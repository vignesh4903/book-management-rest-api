package com.vignesh.Book_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vignesh.Book_Management_System.entity.Books;

public interface BmsRep extends JpaRepository<Books, Long> {

}
