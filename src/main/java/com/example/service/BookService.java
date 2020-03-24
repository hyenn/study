package com.example.service;

import java.util.HashMap;

import com.example.domain.Book;

public interface BookService {
	
	/**
	 * 책 정보 입력
	 * @param book
	 */
	void createBook(Book book);

	
	/**
	 * 책 번호로 책 정보를 반환
	 * @param seq
	 * @return
	 */
	Book readBook(Long seq);
	
	/**
	 * 모든 책 정보를 반환	
	 * @return
	 */
	HashMap<Long, Book> readBookAll();
	
	/**
	 * 책 정보 업데이트
	 * @param book
	 * @return
	 */
	Long updateBook(Book book);
	
	/**
	 * 책 정보 삭제
	 * @param seq
	 */
	void deleteBook(Long seq);
}
