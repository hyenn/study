package com.example.repository;

import java.util.HashMap;

import com.example.domain.Book;

public interface BookRepository {

	/**
	 * 책 정보 저장
	 * @param book
	 */
	void createBook(Book book);
	
	/**
	 * 책 정보 읽기
	 * @param seq
	 * @return
	 */
	Book getBook(Long seq);
	
	/**
	 * 모든 책 정보 읽기
	 * @return
	 */
	HashMap<Long, Book> getBookAll();
	
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
	
	/**
	 * 마지막 책 번호 반환
	 * @return
	 */
	Long getLastID();
	
}
