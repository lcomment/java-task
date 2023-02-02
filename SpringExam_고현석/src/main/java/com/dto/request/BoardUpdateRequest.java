package com.dto.request;

import org.apache.ibatis.type.Alias;

@Alias("BoardUpdateRequest")
public class BoardUpdateRequest {
	private int no;
	private int readcnt;
	private String title;
	private String author;
	private String content;
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public int getReadCnt() {
		return readcnt;
	}

	public void setReadCnt(int readcnt) {
		this.readcnt = readcnt;
	}

	public BoardUpdateRequest() {}
	
	public BoardUpdateRequest(int no, int readcnt, String title, String author, String content) {
		super();
		this.no = no;
		this.title = title;
		this.author = author;
		this.content = content;
		this.readcnt = readcnt;
	}
	
	
}
