package com.example.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Book;
import com.example.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookserv;
	
	@RequestMapping(value="/book/info", method=RequestMethod.GET)
	public Book info(Long id){
		
		return bookserv.readBook(id);
	}
	
	@RequestMapping(value="/book/all", method=RequestMethod.GET)
	public HashMap<Long, Book> all(){
		
		return bookserv.readBookAll();
	}
	
	@RequestMapping(value="/book/create", method=RequestMethod.GET)
	public void create(){
		bookserv.createBook(new Book());
	}
	
	@RequestMapping(value="/book/update", method=RequestMethod.GET)
	public Long update(Book book){
		return bookserv.updateBook(book); 
	}
	
	@RequestMapping(value="/book/delete", method=RequestMethod.GET)
	public void delete(Long id){
		bookserv.deleteBook(id);
	}

}
