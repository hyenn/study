package com.example.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Book;
import com.example.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepo;
	
	@Override
	public void createBook(Book book) {

		bookRepo.createBook(book);
	}

	@Override
	public Book readBook(Long seq) {

		return bookRepo.getBook(seq);
	}

	@Override
	public HashMap<Long, Book> readBookAll() {

		return bookRepo.getBookAll();
	}

	@Override
	public void deleteBook(Long seq) {

		bookRepo.deleteBook(seq);
	}

	@Override
	public Long updateBook(Book book) {

		return bookRepo.updateBook(book);
	}

}
