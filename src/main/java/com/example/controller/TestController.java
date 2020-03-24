package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.service.BookService;

@Controller
public class TestController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/test4", method=RequestMethod.GET)
	public String test4(Model model){
		model.addAttribute("book", bookService.readBook(2L));
		return "test/test4";
	}
	
	@RequestMapping(value="/test4/{id}", method=RequestMethod.GET)
	public String test4_1(Model model, @PathVariable Long id){
		model.addAttribute("book", bookService.readBook(id));
		return "test/test4";
	}
	
	@RequestMapping(value="/test5", method=RequestMethod.GET)
	public String test5(Model model){
		model.addAttribute("book", bookService.readBookAll());
		return "test/test5";
	}
}
