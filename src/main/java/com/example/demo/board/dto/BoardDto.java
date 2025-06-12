package com.example.demo.board.dto;

public class BoardDto {
	private Integer id;
	private String title;
	private String contents;
	private String author;
	private String createAt;
	
	public BoardDto(Integer id, String title, String contents, String author, String createAt) {
		super();
		this.id = id;
		this.title = title;
		this.contents = contents;
		this.author = author;
		this.createAt = createAt;
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
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
}
