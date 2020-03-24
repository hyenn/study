package com.example.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Book {

	private long seq;
	@NotBlank(message="제목은 반드시 입력해야 합니다.")
	private String title;
	@NotBlank(message="저자는 반드시 입력해야 합니다.")
	private String creator;
	@NotNull
	@Size(min=2, message="두 글자 이상 입력해야 합니다.")
	private String publisher;
	private int publishedYear;
	
	
	public long getSeq() {
		return seq;
	}
	public void setSeq(long seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	
	
}
