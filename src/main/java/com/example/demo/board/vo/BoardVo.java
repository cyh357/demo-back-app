package com.example.demo.board.vo;

import com.example.demo.board.dto.BoardDto;

public class BoardVo {
	private Integer id;
	private String title;
	private String contents;
	private String author;
	private String createAt;
	
	public Integer getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getCreateAt() {
		return createAt;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}


	public BoardVo(Integer id, String title, String contents, String author, String createAt) {
		super();
		this.id = id;
		this.title = title;
		this.contents = contents;
		this.author = author;
		this.createAt = createAt;
	}
	
	// DTO를 직접 받는 생성자 정의
    public BoardVo(BoardDto dto) {
        this.id = dto.getId();
        this.title = dto.getTitle();
        this.contents = dto.getContents();
        this.author = dto.getAuthor();
        this.createAt = dto.getContents();
    }

}