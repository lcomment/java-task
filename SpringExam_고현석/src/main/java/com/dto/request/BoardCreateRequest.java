package com.dto.request;

import org.apache.ibatis.type.Alias;

@Alias("BoardCreateRequest")
public class BoardCreateRequest {
	private int id;
	private String title;
	private String author;
	private String content;
	private String writeday;
	private int readcnt;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriteday() {
		return writeday;
	}

	public void setWriteday(String writeday) {
		this.writeday = writeday;
	}

	public int getReadCnt() {
		return readcnt;
	}

	public void setReadCnt(int readcnt) {
		this.readcnt = readcnt;
	}

	public BoardCreateRequest() {}
	
	public BoardCreateRequest(int id, String title, String author, String content, String writeday, int readcnt) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.content = content;
		this.writeday = writeday;
		this.readcnt = readcnt;
	}
	
	
}
