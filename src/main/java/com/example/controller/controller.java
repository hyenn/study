package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Book;

@RestController
public class controller {

	@RequestMapping(value="test", method=RequestMethod.GET)
	public String test() {
		return "Welcome :D";
	}
	
	@RequestMapping(value="test2", method=RequestMethod.GET)
	public String test2(String user){
		return "Welcome " + user;
	}
	
	@RequestMapping(value="test3", method=RequestMethod.GET)
	public Book test3(){
		
		Book book = new Book();
		book.setSeq(1);
		book.setTitle("제목");
		book.setCreator("저자");
		book.setPublisher("출판사");
		book.setPublishedYear(2020);
		
		return book;
		
	}
}
