package com.example.demo.board.dto;

import java.util.Date;

public class BoardDto {
	private Integer id;
	private String title;
	private String contents;
	private String author;
	private Date createdAt;
	
	public BoardDto(Integer id, String title, String contents, String author, Date createdAt) {
		super();
		this.id = id;
		this.title = title;
		this.contents = contents;
		this.author = author;
		this.createdAt = createdAt;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
