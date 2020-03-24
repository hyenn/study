package com.example.repository;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.example.domain.Book;

@Repository
public class BookRepositoryImpl implements BookRepository {

	private HashMap<Long, Book> bookMap;
	private Long id = 0L;
	
	@PostConstruct
	public void init(){
		Logger.getLogger("com.example.repository.BookRepositoryImpl").log(Level.INFO, "Test for repository data");
		bookMap = new HashMap<Long, Book>();
		
		for(int i = 0; i < 10; i++){
			id++;
			Book book = new Book();
			book.setSeq(id);
			book.setTitle("책 제목 " + id);
			book.setCreator("책 저자 " + id);
			book.setPublisher("출판사 " + id);
			book.setPublishedYear(2020);
			
			bookMap.put(id, book);
		}
	}
	
	@Override
	public void createBook(Book book) {

		book.setSeq(++id);
		bookMap.put(id, book);
	}

	@Override
	public Book getBook(Long seq) {

		return bookMap.get(seq);
	}

	@Override
	public HashMap<Long, Book> getBookAll() {
		return bookMap;
	}

	@Override
	public Long updateBook(Book book) {

		Long id = book.getSeq();
		bookMap.put(id, book);
		
		return id;
	}

	@Override
	public void deleteBook(Long seq) {

		bookMap.remove(seq);
	}

	@Override
	public Long getLastID() {

		return id;
	}

}
