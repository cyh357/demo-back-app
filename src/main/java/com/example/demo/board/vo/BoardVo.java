package com.example.demo.board.vo;



import java.util.Date;

import com.example.demo.board.dto.BoardDto;

public class BoardVo {
	private Integer id;
	private String title;
	private String contents;
	private String author;
	private Date createdAt;
	
	public Integer getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Date getCreatedAt() {
		return createdAt;
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


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public BoardVo() {}
	
	// DTO를 직접 받는 생성자 정의
    public BoardVo(BoardDto dto) {
        this.id = dto.getId();
        this.title = dto.getTitle();
        this.contents = dto.getContents();
        this.author = dto.getAuthor();
        this.createdAt = dto.getCreatedAt();
    }

}