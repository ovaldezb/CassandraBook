package com.ovaldez.cassandra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ovaldez.cassandra.entity.Book;
import com.ovaldez.cassandra.repository.BookRepository;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {

	@Autowired
	private BookRepository bookRepository;
	
	@PostMapping
	public ResponseEntity<?> createBook(@RequestBody Book book){
		return ResponseEntity.ok(bookRepository.save(book));
	}
	
	@GetMapping
	public ResponseEntity<?> getAllBooks(){
		return ResponseEntity.ok(bookRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getBookById(@PathVariable final String id){
		return ResponseEntity.ok(bookRepository.findById(Integer.valueOf(id)));
	}
	
	@PutMapping
	public ResponseEntity<?> updateBook(@RequestBody Book book){
		return ResponseEntity.ok(bookRepository.insert(book));
	}
}
