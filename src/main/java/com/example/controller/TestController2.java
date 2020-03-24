package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.Book;
import com.example.service.BookService;

@Controller
public class TestController2 {

	private Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/test6", method=RequestMethod.GET)
	public String test6(Model model, Book book){
		return "test/test6";
	}
	
	@RequestMapping(value="/test6_1", method=RequestMethod.POST)
	public String test6_1(HttpServletRequest req, Model model, Book book){
		bookService.createBook(book);
		model.addAttribute("bookMap", bookService.readBookAll());
		
		return "test/test6_1";
	}
	
	@RequestMapping(value="/test7", method=RequestMethod.GET)
	public String test7(Model model, Book book){
		return "test/test7";
	}
	
	@RequestMapping(value="/test7_1", method=RequestMethod.POST)
	public String test7_1(Model model, Book book){
		bookService.createBook(book);
		model.addAttribute("bookMap", bookService.readBookAll());
		
		return "test/test7::#list";
	}
	
	@RequestMapping(value="/test8", method=RequestMethod.GET)
	public String test8(Model model, Book book){
		return "test/test8";
	}
	
	@RequestMapping(value="/test8", method=RequestMethod.POST)
	public String checkBook(Model model, @Valid Book book, BindingResult bindingResult){
		
		if(bindingResult.hasErrors()){
			return "test/test8::#form";
		}
		
		bookService.createBook(book);
		model.addAttribute("bookMap", bookService.readBookAll());
		return "test/test8::#list";
	}
}
